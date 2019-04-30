package com.itiaoling.dbdiff.mappers;

import com.itiaoling.dbdiff.models.MerchantDeliverFee;
import com.itiaoling.dbdiff.models.MerchantDeliverFeeExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantDeliverFeeMapper {
    int countByExample(MerchantDeliverFeeExample example);

    int deleteByExample(MerchantDeliverFeeExample example);

    int deleteByPrimaryKey(BigDecimal feeid);

    int insert(MerchantDeliverFee record);

    int insertSelective(MerchantDeliverFee record);

    List<MerchantDeliverFee> selectByExample(MerchantDeliverFeeExample example);

    MerchantDeliverFee selectByPrimaryKey(BigDecimal feeid);

    int updateByExampleSelective(@Param("record") MerchantDeliverFee record, @Param("example") MerchantDeliverFeeExample example);

    int updateByExample(@Param("record") MerchantDeliverFee record, @Param("example") MerchantDeliverFeeExample example);

    int updateByPrimaryKeySelective(MerchantDeliverFee record);

    int updateByPrimaryKey(MerchantDeliverFee record);
}