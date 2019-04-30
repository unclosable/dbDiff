package com.itiaoling.dbdiff;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itiaoling.dbdiff.models.CodBaseInfo;
import com.itiaoling.dbdiff.models.IncomeBaseinfo;
import com.itiaoling.dbdiff.service.DBService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ErrorListTest {
	Log logger = LogFactory.getLog("TESTINFO");
	@Resource
	DBService dbService;

	@Test
	public void gagga() {
		List<BigDecimal> waybillNos = this.dbService.getErrorNo();
		waybillNos.parallelStream().forEach(no -> {
			try {
				IncomeBaseinfo ici = this.dbService.queryIncomeBaseinfo_prod(no);
				CodBaseInfo cbi = this.dbService.queryCodBaseInfo(no);

				StringBuilder builder = new StringBuilder();
				builder.append(no.toString());
				builder.append(
						"-Needbackamount-" + String.format("--[COD:%s]-[INCOME:%s]", cbi.getNeedbackamount(),
								ici.getNeedbackamount()));
				builder.append("-Needpayamount-" + String.format("--[COD:%s]-[INCOME:%s]", cbi.getNeedpayamount(),
						ici.getNeedpayamount()));
				builder.append("-Paidamount-" + String.format("--[COD:%s]-[INCOME:%s]", cbi.getPaidamount(),
						ici.getPaidamount()));
				logger.info(builder.toString());

				this.dbService.updateCodBaseInfo(no, ici.getNeedbackamount(), ici.getNeedpayamount(),
						ici.getPaidamount());
			} catch (Exception e) {
				logger.info(no + "--eeeeeeeeeeeeeeeeeeeeeror");
			}
		});
	}

}
