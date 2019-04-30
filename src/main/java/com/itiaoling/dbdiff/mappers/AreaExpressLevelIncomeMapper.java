package com.itiaoling.dbdiff.mappers;

import com.itiaoling.dbdiff.models.AreaExpressLevelIncome;
import com.itiaoling.dbdiff.models.AreaExpressLevelIncomeExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaExpressLevelIncomeMapper {
    int countByExample(AreaExpressLevelIncomeExample example);

    int deleteByExample(AreaExpressLevelIncomeExample example);

    int deleteByPrimaryKey(BigDecimal autoid);

    int insert(AreaExpressLevelIncome record);

    int insertSelective(AreaExpressLevelIncome record);

    List<AreaExpressLevelIncome> selectByExample(AreaExpressLevelIncomeExample example);

    AreaExpressLevelIncome selectByPrimaryKey(BigDecimal autoid);

    int updateByExampleSelective(@Param("record") AreaExpressLevelIncome record, @Param("example") AreaExpressLevelIncomeExample example);

    int updateByExample(@Param("record") AreaExpressLevelIncome record, @Param("example") AreaExpressLevelIncomeExample example);

    int updateByPrimaryKeySelective(AreaExpressLevelIncome record);

    int updateByPrimaryKey(AreaExpressLevelIncome record);
}