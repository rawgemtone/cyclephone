package com.qianfeng.phone.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PhoneDiscountMapper {
    int queryDiscountByClearId(@Param("clearConditionId") int clearConditionId);
    int queryDiscountByClearId(@Param("clearConditionids") String[] clearConditionids);
}
