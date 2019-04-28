package com.qianfeng.phone.mapper;

import com.qianfeng.phone.dto.PhoneType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PhoneTypeMapper {
    List<PhoneType> queryTypeByBrandId(@Param("brandId") int brandId);
    List<PhoneType> queryAllType();
    int queryTypeCount();
    int queryTypeMoney(int phoneTypeId);
}
