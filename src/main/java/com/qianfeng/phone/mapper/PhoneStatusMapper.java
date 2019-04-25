package com.qianfeng.phone.mapper;

import com.qianfeng.phone.dto.PhoneStatus;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PhoneStatusMapper {
    List<PhoneStatus> queryAllStatus();
}
