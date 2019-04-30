package com.itiaoling.dbdiff.service;

import java.math.BigDecimal;
import java.util.List;

import com.itiaoling.dbdiff.models.CodBaseInfo;
import com.itiaoling.dbdiff.models.IncomeBaseinfo;
import com.itiaoling.dbdiff.models.IncomeFeeinfo;

public interface DBService {

	List<IncomeBaseinfo> getBaseInfoByEndAndStart(long start, long end);

	List<IncomeFeeinfo> getFeeInfoByEndAndStart(long start, long end);

	List<CodBaseInfo> getCodBaseInfoByEndAndStart(long start, long end);
	
	IncomeBaseinfo queryIncomeBaseinfo_prod(BigDecimal waybillNo) throws NotFoundException;

	IncomeFeeinfo queryIncomeFeeinfo_prod(BigDecimal waybillNo) throws NotFoundException;

	CodBaseInfo queryCodBaseInfo(BigDecimal waybillNo) throws NotFoundException;

	List<CodBaseInfo> getCodBaseInfoByEndAndStart_prod(long start, long end);

	List<BigDecimal> getErrorNo();

	void updateCodBaseInfo(BigDecimal waybillno, BigDecimal Needbackamount, BigDecimal Needpayamount,
			BigDecimal Paidamount);

	public static class NotFoundException extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = -32185326082907736L;
	}
}
