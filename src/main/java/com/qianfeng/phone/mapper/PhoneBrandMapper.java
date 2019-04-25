package com.qianfeng.phone.mapper;


import com.qianfeng.phone.dto.PhoneBrand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PhoneBrandMapper {
    List<PhoneBrand> queryAllBrand();

}
