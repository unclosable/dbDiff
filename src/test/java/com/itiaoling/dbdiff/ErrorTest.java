package com.itiaoling.dbdiff;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.itiaoling.dbdiff.models.CodBaseInfo;
import com.itiaoling.dbdiff.models.IncomeBaseinfo;
import com.itiaoling.dbdiff.service.DBService;
import com.itiaoling.dbdiff.service.DBService.NotFoundException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ErrorTest {
	Log logger = LogFactory.getLog("TESTINFO");
	@Resource
	DBService dbService;

	@Test
	public void gagga() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, 9);
		calendar.set(Calendar.DAY_OF_MONTH, 12);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);

		while (calendar.get(Calendar.DAY_OF_MONTH) < 18) {
			long s = calendar.getTimeInMillis();
			calendar.add(Calendar.HOUR, 1);
			long e = calendar.getTimeInMillis();

			List<CodBaseInfo> baseInfos = this.dbService.getCodBaseInfoByEndAndStart_prod(s, e);
			baseInfos.parallelStream().forEach(info -> {

				IncomeBaseinfo incomeBaseinfo;
				try {
					incomeBaseinfo = this.dbService.queryIncomeBaseinfo_prod(info.getWaybillno());
				} catch (NotFoundException er) {
					logger.info("IncomeBaseinfo 没有数据" + JSON.toJSONString(info));
					return;
				}
				if (equalsss(info.getNeedbackamount(), incomeBaseinfo.getNeedbackamount())
						&& equalsss(info.getNeedpayamount(), incomeBaseinfo.getNeedpayamount())
						&& equalsss(info.getPaidamount(), incomeBaseinfo.getPaidamount())) {
					return;
				} else {
					StringBuilder builder = new StringBuilder();
					builder.append(info.getWaybillno().toString());
					builder.append(
							"-Needbackamount-" + String.format("--[COD:%s]-[INCOME:%s]", info.getNeedbackamount(),
									incomeBaseinfo.getNeedbackamount()));
					builder.append("-Needpayamount-" + String.format("--[COD:%s]-[INCOME:%s]", info.getNeedpayamount(),
							incomeBaseinfo.getNeedpayamount()));
					builder.append("-Paidamount-" + String.format("--[COD:%s]-[INCOME:%s]", info.getPaidamount(),
							incomeBaseinfo.getPaidamount()));
					logger.info(builder.toString());
				}
			});
		}
	}

	private boolean equalsss(BigDecimal v1, BigDecimal v2) {
		if (v1 == null || v2 == null) {
			if (v1 == v2) {
				return true;
			} else {
				return false;
			}
		} else {
			return v1.compareTo(v2) == 0;
		}
	}
}
