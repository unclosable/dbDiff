package com.itiaoling.dbdiff.service.impl;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.itiaoling.dbdiff.models.CodBaseInfo;
import com.itiaoling.dbdiff.models.IncomeBaseinfo;
import com.itiaoling.dbdiff.models.OrderComplexQuery;
import com.itiaoling.dbdiff.service.FMS_DBFix_2017_12_21_Service;
import com.itiaoling.dbdiff.service.FixAct;

@Service
public class FixActImpl implements FixAct {

	Log log = LogFactory.getLog(FixAct.class);

	@Resource
	FMS_DBFix_2017_12_21_Service FMS_DBFix_2017_12_21_Service;

	@Override
	public void incomeBaseinfoAct() {
		Calendar flg = Calendar.getInstance();
		flg.set(Calendar.YEAR, 2017);
		flg.set(Calendar.MONTH, 11);
		flg.set(Calendar.DAY_OF_MONTH, 20);
		flg.set(Calendar.HOUR_OF_DAY, 19);
		flg.set(Calendar.MINUTE, 30);
		flg.set(Calendar.SECOND, 00);

		while (flg.get(Calendar.DAY_OF_MONTH) == 20) {
			Date start = flg.getTime();
			flg.add(Calendar.MINUTE, 30);
			Date end = flg.getTime();
			List<IncomeBaseinfo> baseinfos = FMS_DBFix_2017_12_21_Service.dirtyData_incomebaseinfo(start, end);
			log.info(String.format("start:%tT    end:%tT    size:%d", start, end, baseinfos.size()));
			baseinfos.parallelStream().forEach(info -> {
				BigDecimal waybillno = info.getWaybillno();
				List<OrderComplexQuery> queries = FMS_DBFix_2017_12_21_Service.complexQueries(waybillno);
				if (queries == null || queries.isEmpty() || queries.size() > 1) {
					log.error(String.format("can't handler waybillno: %d", waybillno.longValue()));
				} else {
					OrderComplexQuery query = queries.get(0);
					IncomeBaseinfo baseinfo = new IncomeBaseinfo();
					// update key
					baseinfo.setCreatetime(info.getCreatetime());
					baseinfo.setIncomeid(info.getIncomeid());
					// update set
					baseinfo.setProvince(query.getToprovince());
					baseinfo.setCity(query.getTocity());
					baseinfo.setArea(query.getToarea());
					baseinfo.setReceiveaddress(
							query.getToprovince() + query.getTocity() + query.getToarea() + query.getToaddress());
					baseinfo.setSendprovince(query.getFromprovince());
					baseinfo.setSendcity(query.getFromcity());
					boolean success = FMS_DBFix_2017_12_21_Service.updateIncomeBaseinfo(baseinfo);
					if (!success) {
						log.error(String.format("update failed waybillno: %d", waybillno.longValue()));
					}
				}

			});
		}

	}

	@Override
	public void codBaseinfoAct() {
		Calendar flg = Calendar.getInstance();
		flg.set(Calendar.YEAR, 2017);
		flg.set(Calendar.MONTH, 11);
		flg.set(Calendar.DAY_OF_MONTH, 21);
		flg.set(Calendar.HOUR_OF_DAY, 0);
		flg.set(Calendar.MINUTE, 0);
		flg.set(Calendar.SECOND, 0);

		while (flg.get(Calendar.DAY_OF_MONTH) == 21) {
			Date start = flg.getTime();
			flg.add(Calendar.MINUTE, 30);
			Date end = flg.getTime();
			List<CodBaseInfo> baseinfos = FMS_DBFix_2017_12_21_Service.dirtyData_codBaseInfo(start, end);
			log.info(String.format("start:%tT    end:%tT    size:%d", start, end, baseinfos.size()));
			baseinfos.parallelStream().forEach(info -> {
				BigDecimal waybillno = info.getWaybillno();
				List<OrderComplexQuery> queries = FMS_DBFix_2017_12_21_Service.complexQueries(waybillno);
				if (queries == null || queries.isEmpty() || queries.size() > 1) {
					log.error(String.format("can't handler waybillno: %d", waybillno.longValue()));
				} else {
					OrderComplexQuery query = queries.get(0);
					CodBaseInfo baseinfo = new CodBaseInfo();
					// update key
					baseinfo.setCreatetime(info.getCreatetime());
					baseinfo.setInfoid(info.getInfoid());
					// update set
					baseinfo.setProvince(query.getToprovince());
					baseinfo.setCity(query.getTocity());
					baseinfo.setArea(query.getToarea());
					baseinfo.setAddress(
							query.getToprovince() + query.getTocity() + query.getToarea() + query.getToaddress());
					baseinfo.setSendprovince(query.getFromprovince());
					baseinfo.setSendcity(query.getFromcity());
					boolean success = FMS_DBFix_2017_12_21_Service.updateCodBaseInfo(baseinfo);
					if (!success) {
						log.error(String.format("update failed waybillno: %d", waybillno.longValue()));
					}
				}

			});
		}

	}
}
