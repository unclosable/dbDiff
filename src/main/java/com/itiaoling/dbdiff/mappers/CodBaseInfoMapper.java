package com.itiaoling.dbdiff.mappers;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.itiaoling.dbdiff.models.CodBaseInfo;
import com.itiaoling.dbdiff.models.CodBaseInfoExample;

public interface CodBaseInfoMapper {
    int countByExample(CodBaseInfoExample example);

    int deleteByExample(CodBaseInfoExample example);

    int deleteByPrimaryKey(@Param("infoid") BigDecimal infoid, @Param("createtime") Date createtime);

    int insert(CodBaseInfo record);

    int insertSelective(CodBaseInfo record);

    List<CodBaseInfo> selectByExample(CodBaseInfoExample example);

    CodBaseInfo selectByPrimaryKey(@Param("infoid") BigDecimal infoid, @Param("createtime") Date createtime);

    int updateByExampleSelective(@Param("record") CodBaseInfo record, @Param("example") CodBaseInfoExample example);

    int updateByExample(@Param("record") CodBaseInfo record, @Param("example") CodBaseInfoExample example);

    int updateByPrimaryKeySelective(CodBaseInfo record);

    int updateByPrimaryKey(CodBaseInfo record);

	List<CodBaseInfo> selectDirtyData(@Param("start") Date start, @Param("end") Date end);
}