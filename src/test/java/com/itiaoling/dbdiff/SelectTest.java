package com.itiaoling.dbdiff;

import java.math.BigDecimal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.itiaoling.dbdiff.service.DBTestService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SelectTest {
	@Resource
	DBTestService DBTestService;

	@Test
	public void contextLoads() throws InterruptedException {
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 50; i++) {
			if (i % 2 == 0) {
				fixedThreadPool.execute(() -> {
					System.out.println(
							"PROD--" + JSON
									.toJSONString(this.DBTestService.getFromProd(new BigDecimal(11706011871661l))));
				});
			} else {
				fixedThreadPool.execute(() -> {
					System.out.println(
							"TEST--" + JSON
									.toJSONString(this.DBTestService.getFromTest(new BigDecimal(41510265441864l))));
				});
			}
		}
		fixedThreadPool.shutdown();
		while (true) {
			if (fixedThreadPool.isTerminated()) {
				System.out.println("done");
				break;
			}
			Thread.sleep(200);
		}
	}

}
