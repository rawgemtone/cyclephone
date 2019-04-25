package com.qianfeng.phone.service.impl;

import com.qianfeng.phone.dto.ClearCondition;
import com.qianfeng.phone.dto.PhoneBrand;
import com.qianfeng.phone.dto.PhoneStatus;
import com.qianfeng.phone.dto.PhoneType;
import com.qianfeng.phone.mapper.ClearConditionMapper;
import com.qianfeng.phone.mapper.PhoneBrandMapper;
import com.qianfeng.phone.mapper.PhoneStatusMapper;
import com.qianfeng.phone.mapper.PhoneTypeMapper;
import com.qianfeng.phone.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PhoneServiceImpl implements PhoneService
{
    @Autowired
    PhoneBrandMapper phoneBrandMapper;
    @Autowired
    PhoneTypeMapper phoneTypeMapper;
    @Autowired
    PhoneStatusMapper phoneStatusMapper;
    @Autowired
    ClearConditionMapper clearConditionMapper;
    @Override
    public List<PhoneBrand> queryAllBrand() {
       List<PhoneBrand> brands =  phoneBrandMapper.queryAllBrand();
        return brands;
    }

    @Override
    public List<PhoneType> queryTypeByBrandId(int brandId) {
        List<PhoneType> types = phoneTypeMapper.queryTypeByBrandId(brandId);
        return types;
    }
    @Override
    public int querytypecount() {
        return 0;
    }

    @Override
    public List<PhoneStatus> queryAllStatus() {
        List<PhoneStatus> statuses =  phoneStatusMapper.queryAllStatus();
        return statuses;
    }

    @Override
    public List<ClearCondition> queryClearConditionByStatusId(int phoneStatusId) {
        List<ClearCondition> clearConditions = clearConditionMapper.queryClearConditionByStatusId(phoneStatusId);
        return clearConditions;
    }


}
