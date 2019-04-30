package com.itiaoling.dbdiff;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itiaoling.dbdiff.service.FixAct;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DirtyDataFix {
	@Resource
	FixAct fixAct;

	@Test
	public void contextLoads() {
		// fixAct.incomeBaseinfoAct();
		fixAct.codBaseinfoAct();
	}

}
