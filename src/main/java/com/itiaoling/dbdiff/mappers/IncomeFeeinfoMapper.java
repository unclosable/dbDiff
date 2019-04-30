package com.itiaoling.dbdiff.mappers;

import com.itiaoling.dbdiff.models.IncomeFeeinfo;
import com.itiaoling.dbdiff.models.IncomeFeeinfoExample;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IncomeFeeinfoMapper {
    int countByExample(IncomeFeeinfoExample example);

    int deleteByExample(IncomeFeeinfoExample example);

    int deleteByPrimaryKey(@Param("incomefeeid") BigDecimal incomefeeid, @Param("createtime") Date createtime);

    int insert(IncomeFeeinfo record);

    int insertSelective(IncomeFeeinfo record);

    List<IncomeFeeinfo> selectByExample(IncomeFeeinfoExample example);

    IncomeFeeinfo selectByPrimaryKey(@Param("incomefeeid") BigDecimal incomefeeid, @Param("createtime") Date createtime);

    int updateByExampleSelective(@Param("record") IncomeFeeinfo record, @Param("example") IncomeFeeinfoExample example);

    int updateByExample(@Param("record") IncomeFeeinfo record, @Param("example") IncomeFeeinfoExample example);

    int updateByPrimaryKeySelective(IncomeFeeinfo record);

    int updateByPrimaryKey(IncomeFeeinfo record);
}