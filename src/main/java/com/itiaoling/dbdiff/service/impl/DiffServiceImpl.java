package com.itiaoling.dbdiff.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Service;

import com.itiaoling.dbdiff.models.CodBaseInfo;
import com.itiaoling.dbdiff.models.IncomeBaseinfo;
import com.itiaoling.dbdiff.models.IncomeFeeinfo;
import com.itiaoling.dbdiff.service.DBService;
import com.itiaoling.dbdiff.service.DBService.NotFoundException;
import com.itiaoling.dbdiff.service.DiffService;

@Service
public class DiffServiceImpl implements DiffService {
	private static final int check_hour = 12;
	private static final Set<String> baseinfo_exclude = new HashSet<>(
			Arrays.asList("incomeid", "createtime", "updatetime"));
	private static final Set<String> feeinfo_exclude = new HashSet<>(
			Arrays.asList("incomefeeid", "createtime", "updatetime"));
	private static final Set<String> codbaseinfo_exclude = new HashSet<>(
			Arrays.asList("infoid", "createtime", "updatetime"));

	@Resource
	DBService dbService;

	@Override
	public void baseinfoDiff(Date actiongtime, Log log) {
		long[] times = getStartAndEnd(actiongtime);
		List<IncomeBaseinfo> baseinfos = this.dbService.getBaseInfoByEndAndStart(times[0], times[1]);
		log.info("IncomeBaseinfo records:" + baseinfos.size());
		baseinfos.parallelStream().forEach(info -> {
			BigDecimal waybillNo = info.getWaybillno();
			try {
				IncomeBaseinfo prodRecord = this.dbService.queryIncomeBaseinfo_prod(waybillNo);
				if (!prodRecord.equals(info)) {
					printDiff("Check IncomeBaseinfo waybillNo:" + waybillNo.toString(), prodRecord, info, log,
							baseinfo_exclude);
				}
				return;
			} catch (NotFoundException e) {
				log.info("can't find waybillNo in prod DB:" + waybillNo.toString());
			} catch (Throwable e) {
				e.printStackTrace();
				log.info("check failed:" + waybillNo.toString());
			}
		});
	}

	@Override
	public void feeinfoDiff(Date actiongtime, Log log) {
		long[] times = getStartAndEnd(actiongtime);
		List<IncomeFeeinfo> feeinfos = this.dbService.getFeeInfoByEndAndStart(times[0], times[1]);
		log.info("IncomeFeeinfo records:" + feeinfos.size());
		feeinfos.parallelStream().forEach(info -> {
			BigDecimal waybillNo = info.getWaybillno();
			try {
				IncomeFeeinfo prodRecord = this.dbService.queryIncomeFeeinfo_prod(waybillNo);
				if (!prodRecord.equals(info)) {
					printDiff("Check IncomeFeeinfo waybillNo:" + waybillNo.toString(), prodRecord, info, log,
							feeinfo_exclude);
				}
				return;
			} catch (NotFoundException e) {
				log.info("can't find waybillNo in prod DB:" + waybillNo.toString());
			} catch (Throwable e) {
				e.printStackTrace();
				log.info("check failed:" + waybillNo.toString());
			}
		});
	}

	@Override
	public void codbaseinfoDiff(Date actiongtime, Log log) {
		long[] times = getStartAndEnd(actiongtime);
		List<CodBaseInfo> baseInfos = this.dbService.getCodBaseInfoByEndAndStart(times[0], times[1]);
		log.info("CodBaseInfo records:" + baseInfos.size());
		baseInfos.parallelStream().forEach(info -> {
			BigDecimal waybillNo = info.getWaybillno();
			try {
				CodBaseInfo prodRecord = this.dbService.queryCodBaseInfo(waybillNo);
				if (!prodRecord.equals(info)) {
					printDiff("Check CodBaseInfo waybillNo:" + waybillNo.toString(), prodRecord, info, log,
							codbaseinfo_exclude);
				}
				return;
			} catch (NotFoundException e) {
				log.info("can't find waybillNo in prod DB:" + waybillNo.toString());
			} catch (Throwable e) {
				e.printStackTrace();
				log.info("check failed:" + waybillNo.toString());
			}
		});
	}

	private <T> void printDiff(String prefix, T prod, T test, Log log, Set<String> excludeSet)
			throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<T> theClass = (Class<T>) prod.getClass();
		Field[] fields = theClass.getDeclaredFields();
		StringBuilder builder = new StringBuilder();
		builder.append(prefix);
		for (Field field : fields) {
			String fieldName = field.getName();
			if (excludeSet != null && excludeSet.contains(fieldName)) {
				continue;
			}
			Method get = theClass.getMethod("get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1));
			Object prodP = get.invoke(prod);
			Object testP = get.invoke(test);
			if (prodP == null && testP == null) {
				continue;
			} else if (prodP == null) {
				builder.append("\n");
				builder.append("--" + fieldName + String.format("--[prod:NULL]-[test:%s]", testP));
			} else if (testP == null) {
				builder.append("\n");
				builder.append("--" + fieldName + String.format("--[prod:%s]-[test:NULL]", prodP));
			} else if (!prodP.equals(testP)) {
				builder.append("\n");
				builder.append("--" + fieldName + String.format("--[prod:%s]-[test:%s]", prodP, testP));
			}
		}
		log.info(builder.toString());
	}

	private long[] getStartAndEnd(Date date) {
		long[] re = new long[2];
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.add(Calendar.HOUR, -check_hour);
		re[0] = calendar.getTimeInMillis();
		calendar.add(Calendar.HOUR, 1);
		re[1] = calendar.getTimeInMillis();
		return re;
	}
}
