package com.qianfeng.phone.service;


import com.qianfeng.phone.dto.PhoneBrand;
import com.qianfeng.phone.dto.PhoneStatus;
import com.qianfeng.phone.dto.PhoneType;

import java.util.List;

public interface PhoneService {
    List<PhoneBrand> queryAllBrand();
    List<PhoneType> queryTypeByBrandId(int brandId);
    List<PhoneStatus> queryAllStatus(int phoneTypeId);
    int queryDiscountByClearId(int clearConditionId);

}
