package com.itiaoling.dbdiff.mappers;

import com.itiaoling.dbdiff.models.WaybillStatusChangeLog;
import com.itiaoling.dbdiff.models.WaybillStatusChangeLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaybillStatusChangeLogMapper {
    int countByExample(WaybillStatusChangeLogExample example);

    int deleteByExample(WaybillStatusChangeLogExample example);

    int insert(WaybillStatusChangeLog record);

    int insertSelective(WaybillStatusChangeLog record);

    List<WaybillStatusChangeLog> selectByExample(WaybillStatusChangeLogExample example);

    int updateByExampleSelective(@Param("record") WaybillStatusChangeLog record, @Param("example") WaybillStatusChangeLogExample example);

    int updateByExample(@Param("record") WaybillStatusChangeLog record, @Param("example") WaybillStatusChangeLogExample example);
}