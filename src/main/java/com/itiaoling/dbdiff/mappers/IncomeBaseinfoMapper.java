package com.itiaoling.dbdiff.mappers;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.itiaoling.dbdiff.models.IncomeBaseinfo;
import com.itiaoling.dbdiff.models.IncomeBaseinfoExample;

public interface IncomeBaseinfoMapper {
    int countByExample(IncomeBaseinfoExample example);

    int deleteByExample(IncomeBaseinfoExample example);

    int deleteByPrimaryKey(@Param("incomeid") BigDecimal incomeid, @Param("createtime") Date createtime);

    int insert(IncomeBaseinfo record);

    int insertSelective(IncomeBaseinfo record);

    List<IncomeBaseinfo> selectByExample(IncomeBaseinfoExample example);

    IncomeBaseinfo selectByPrimaryKey(@Param("incomeid") BigDecimal incomeid, @Param("createtime") Date createtime);

    int updateByExampleSelective(@Param("record") IncomeBaseinfo record, @Param("example") IncomeBaseinfoExample example);

    int updateByExample(@Param("record") IncomeBaseinfo record, @Param("example") IncomeBaseinfoExample example);

    int updateByPrimaryKeySelective(IncomeBaseinfo record);

    int updateByPrimaryKey(IncomeBaseinfo record);

	List<IncomeBaseinfo> selectDirtyData(@Param("start") Date start, @Param("end") Date end);
}