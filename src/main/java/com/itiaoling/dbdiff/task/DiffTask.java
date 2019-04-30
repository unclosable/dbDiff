package com.itiaoling.dbdiff.task;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;

import com.itiaoling.dbdiff.service.DiffService;

//@Component
//@EnableScheduling
public class DiffTask {
	@Resource
	DiffService diffService;

	@Scheduled(cron = "0 * * ? * *")
	public void test() {
		System.out.println("test");
	}

	@Scheduled(cron = "0 1 * ? * *")
	public void baseinfo() {
		System.out.println("baseinfo");
		Log log = LogFactory.getLog("baseinfo");
		Date now = new Date();
		diffService.baseinfoDiff(now, log);
	}

	@Scheduled(cron = "0 21 * ? * *")
	public void feeinfo() {
		System.out.println("feeinfo");
		Log log = LogFactory.getLog("feeinfo");
		Date now = new Date();
		diffService.feeinfoDiff(now, log);

	}

	@Scheduled(cron = "0 41 * ? * *")
	public void codinfo() {
		System.out.println("codinfo");
		Log log = LogFactory.getLog("codinfo");
		Date now = new Date();
		diffService.codbaseinfoDiff(now, log);

	}
}
