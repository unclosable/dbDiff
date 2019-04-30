package com.itiaoling.dbdiff.mappers;

import com.itiaoling.dbdiff.models.OrderComplexQuery;
import com.itiaoling.dbdiff.models.OrderComplexQueryExample;
import java.util.List;

public interface OrderComplexQueryMapper {
    int countByExample(OrderComplexQueryExample example);

    List<OrderComplexQuery> selectByExample(OrderComplexQueryExample example);
}