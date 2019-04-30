package com.itiaoling.dbdiff.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.itiaoling.dbdiff.models.CodBaseInfo;
import com.itiaoling.dbdiff.models.IncomeBaseinfo;
import com.itiaoling.dbdiff.models.OrderComplexQuery;

public interface FMS_DBFix_2017_12_21_Service {

	List<OrderComplexQuery> complexQueries(BigDecimal waybillNo);

	List<IncomeBaseinfo> dirtyData_incomebaseinfo(Date start, Date end);

	List<CodBaseInfo> dirtyData_codBaseInfo(Date start, Date end);

	boolean updateIncomeBaseinfo(IncomeBaseinfo baseinfo);

	boolean updateCodBaseInfo(CodBaseInfo baseinfo);


}
