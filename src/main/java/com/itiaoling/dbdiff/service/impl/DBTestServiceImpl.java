package com.itiaoling.dbdiff.service.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itiaoling.dbdiff.aop.ProdDB;
import com.itiaoling.dbdiff.mappers.CodBaseInfoMapper;
import com.itiaoling.dbdiff.models.CodBaseInfo;
import com.itiaoling.dbdiff.models.CodBaseInfoExample;
import com.itiaoling.dbdiff.service.DBTestService;

@Service
public class DBTestServiceImpl implements DBTestService {
	@Resource
	CodBaseInfoMapper codBaseInfoMapper;

	@Override
	public CodBaseInfo getFromTest(BigDecimal waybillNo) {
		CodBaseInfoExample example = new CodBaseInfoExample();
		example.createCriteria().andWaybillnoEqualTo(waybillNo);
		List<CodBaseInfo> baseInfos = this.codBaseInfoMapper.selectByExample(example);
		return baseInfos.isEmpty() ? null : baseInfos.get(0);
	}

	@Override
	@ProdDB
	public CodBaseInfo getFromProd(BigDecimal waybillNo) {
		CodBaseInfoExample example = new CodBaseInfoExample();
		example.createCriteria().andWaybillnoEqualTo(waybillNo);
		List<CodBaseInfo> baseInfos = this.codBaseInfoMapper.selectByExample(example);
		return baseInfos.isEmpty() ? null : baseInfos.get(0);
	}

}
