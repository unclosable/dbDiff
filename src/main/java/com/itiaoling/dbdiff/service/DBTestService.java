package com.itiaoling.dbdiff.service;

import java.math.BigDecimal;

import com.itiaoling.dbdiff.models.CodBaseInfo;

public interface DBTestService {

	CodBaseInfo getFromTest(BigDecimal waybillNo);

	CodBaseInfo getFromProd(BigDecimal waybillNo);

}
