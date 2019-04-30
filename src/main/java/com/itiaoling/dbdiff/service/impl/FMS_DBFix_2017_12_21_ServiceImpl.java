package com.itiaoling.dbdiff.service.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.itiaoling.dbdiff.aop.ProdDB;
import com.itiaoling.dbdiff.aop.ProdwDB;
import com.itiaoling.dbdiff.mappers.CodBaseInfoMapper;
import com.itiaoling.dbdiff.mappers.IncomeBaseinfoMapper;
import com.itiaoling.dbdiff.mappers.OrderComplexQueryMapper;
import com.itiaoling.dbdiff.models.CodBaseInfo;
import com.itiaoling.dbdiff.models.IncomeBaseinfo;
import com.itiaoling.dbdiff.models.OrderComplexQuery;
import com.itiaoling.dbdiff.models.OrderComplexQueryExample;
import com.itiaoling.dbdiff.service.FMS_DBFix_2017_12_21_Service;

@Service
public class FMS_DBFix_2017_12_21_ServiceImpl implements FMS_DBFix_2017_12_21_Service {

	@Resource
	OrderComplexQueryMapper complexQueryMapper;

	@Resource
	IncomeBaseinfoMapper incomeBaseinfoMapper;
	@Resource
	CodBaseInfoMapper codBaseInfoMapper;


	@Override
	@ProdDB
	public List<OrderComplexQuery> complexQueries(BigDecimal waybillNo) {
		OrderComplexQueryExample example = new OrderComplexQueryExample();
		example.createCriteria().andWaybillnoEqualTo(waybillNo);
		return this.complexQueryMapper.selectByExample(example);
	}

	@Override
	@ProdDB
	public List<IncomeBaseinfo> dirtyData_incomebaseinfo(Date start, Date end) {
		return this.incomeBaseinfoMapper.selectDirtyData(start, end);
	}

	@Override
	@ProdDB
	public List<CodBaseInfo> dirtyData_codBaseInfo(Date start, Date end) {
		return this.codBaseInfoMapper.selectDirtyData(start, end);
	}

	@Override
	@ProdwDB
	public boolean updateIncomeBaseinfo(IncomeBaseinfo baseinfo) {
		return this.incomeBaseinfoMapper.updateByPrimaryKeySelective(baseinfo) > 0;
	}

	@Override
	@ProdwDB
	public boolean updateCodBaseInfo(CodBaseInfo baseinfo) {
		return this.codBaseInfoMapper.updateByPrimaryKeySelective(baseinfo) > 0;
	}

	Log log = LogFactory.getLog(FMS_DBFix_2017_12_21_Service.class);

	public static void main(String[] args) {
		Calendar flg = Calendar.getInstance();
		flg.set(Calendar.YEAR, 2017);
		flg.set(Calendar.MONTH, 11);
		flg.set(Calendar.DAY_OF_MONTH, 20);
		flg.set(Calendar.HOUR_OF_DAY, 17);
		flg.set(Calendar.MINUTE, 30);
		flg.set(Calendar.SECOND, 00);

		System.out.println(String.format("%tc", flg.getTime()));
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		while (flg.get(Calendar.DAY_OF_MONTH) == 20) {
			Date start = flg.getTime();
			flg.add(Calendar.MINUTE, 30);
			Date end = flg.getTime();
			System.out.println(String.format("start:%tT    end:%tT", start, end));
		}

	}
}
