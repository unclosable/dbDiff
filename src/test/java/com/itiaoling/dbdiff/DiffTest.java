package com.itiaoling.dbdiff;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itiaoling.dbdiff.service.DiffService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DiffTest {
	@Resource
	DiffService diffService;

	@Test
	public void contextLoads() {
		Date now = new Date();
		Log log = LogFactory.getLog("baseinfo");
		diffService.baseinfoDiff(now, log);
		log = LogFactory.getLog("feeinfo");
		diffService.feeinfoDiff(now, log);
		log = LogFactory.getLog("codinfo");
		diffService.codbaseinfoDiff(now, log);
	}

}
