package com.qianfeng.phone.mapper;

import com.qianfeng.phone.dto.ClearCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClearConditionMapper {
    List<ClearCondition> queryClearConditionByStatusId(int phoneStatusId);
}
