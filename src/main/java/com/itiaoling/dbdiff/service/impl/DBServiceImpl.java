package com.itiaoling.dbdiff.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itiaoling.dbdiff.aop.ProdDB;
import com.itiaoling.dbdiff.aop.ProdwDB;
import com.itiaoling.dbdiff.mappers.BaseInfoMapper;
import com.itiaoling.dbdiff.mappers.CodBaseInfoMapper;
import com.itiaoling.dbdiff.mappers.IncomeBaseinfoMapper;
import com.itiaoling.dbdiff.mappers.IncomeFeeinfoMapper;
import com.itiaoling.dbdiff.models.CodBaseInfo;
import com.itiaoling.dbdiff.models.CodBaseInfoExample;
import com.itiaoling.dbdiff.models.IncomeBaseinfo;
import com.itiaoling.dbdiff.models.IncomeBaseinfoExample;
import com.itiaoling.dbdiff.models.IncomeFeeinfo;
import com.itiaoling.dbdiff.models.IncomeFeeinfoExample;
import com.itiaoling.dbdiff.service.DBService;

@Service
public class DBServiceImpl implements DBService {
	@Resource
	CodBaseInfoMapper codBaseInfoMapper;
	@Resource
	IncomeBaseinfoMapper incomeBaseinfoMapper;
	@Resource
	IncomeFeeinfoMapper incomeFeeinfoMapper;
	@Resource
	BaseInfoMapper baseInfoMapper;

	@Override
	public List<IncomeBaseinfo> getBaseInfoByEndAndStart(long start, long end) {
		IncomeBaseinfoExample example = new IncomeBaseinfoExample();
		example.createCriteria().andCreatetimeBetween(new Date(start), new Date(end));
		return this.incomeBaseinfoMapper.selectByExample(example);
	}

	@Override
	public List<IncomeFeeinfo> getFeeInfoByEndAndStart(long start, long end) {
		IncomeFeeinfoExample example = new IncomeFeeinfoExample();
		example.createCriteria().andCreatetimeBetween(new Date(start), new Date(end));
		return this.incomeFeeinfoMapper.selectByExample(example);
	}

	@Override
	public List<CodBaseInfo> getCodBaseInfoByEndAndStart(long start, long end) {
		CodBaseInfoExample example = new CodBaseInfoExample();
		example.createCriteria().andCreatetimeBetween(new Date(start), new Date(end));
		return this.codBaseInfoMapper.selectByExample(example);
	}

	@Override
	@ProdDB
	public IncomeBaseinfo queryIncomeBaseinfo_prod(BigDecimal waybillNo) throws NotFoundException {
		IncomeBaseinfoExample example = new IncomeBaseinfoExample();
		example.createCriteria().andWaybillnoEqualTo(waybillNo);
		List<IncomeBaseinfo> baseinfos = this.incomeBaseinfoMapper.selectByExample(example);
		if (baseinfos == null || baseinfos.isEmpty()) {
			throw new NotFoundException();
		}
		return baseinfos.get(0);
	}

	@Override
	@ProdDB
	public IncomeFeeinfo queryIncomeFeeinfo_prod(BigDecimal waybillNo) throws NotFoundException {
		IncomeFeeinfoExample example = new IncomeFeeinfoExample();
		example.createCriteria().andWaybillnoEqualTo(waybillNo);
		List<IncomeFeeinfo> feeinfos = this.incomeFeeinfoMapper.selectByExample(example);
		if (feeinfos == null || feeinfos.isEmpty()) {
			throw new NotFoundException();
		}
		return feeinfos.get(0);
	}

	@Override
	@ProdDB
	public CodBaseInfo queryCodBaseInfo(BigDecimal waybillNo) throws NotFoundException {
		CodBaseInfoExample example = new CodBaseInfoExample();
		example.createCriteria().andWaybillnoEqualTo(waybillNo);
		List<CodBaseInfo> baseInfos = this.codBaseInfoMapper.selectByExample(example);
		if (baseInfos == null || baseInfos.isEmpty()) {
			throw new NotFoundException();
		}
		return baseInfos.get(0);
	}

	@Override
	@ProdDB
	public List<CodBaseInfo> getCodBaseInfoByEndAndStart_prod(long start, long end) {
		CodBaseInfoExample example = new CodBaseInfoExample();
		example.createCriteria().andCreatetimeBetween(new Date(start), new Date(end));
		return this.codBaseInfoMapper.selectByExample(example);
	}

	@Override
	@ProdDB
	public List<BigDecimal> getErrorNo() {
		return this.baseInfoMapper.getWaybillIDS();
	}

	@Override
	@ProdwDB
	public void updateCodBaseInfo(BigDecimal waybillno, BigDecimal Needbackamount, BigDecimal Needpayamount,
			BigDecimal Paidamount) {
		CodBaseInfo info = new CodBaseInfo();
		info.setNeedbackamount(Needbackamount);
		info.setNeedpayamount(Needpayamount);
		info.setPaidamount(Paidamount);

		CodBaseInfoExample example = new CodBaseInfoExample();
		example.createCriteria().andWaybillnoEqualTo(waybillno);

		this.codBaseInfoMapper.updateByExampleSelective(info, example);
	}

}
