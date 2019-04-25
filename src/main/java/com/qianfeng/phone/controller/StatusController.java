package com.qianfeng.phone.controller;

import com.qianfeng.phone.dto.ClearCondition;
import com.qianfeng.phone.dto.PhoneStatus;
import com.qianfeng.phone.service.impl.PhoneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/status")
public class StatusController {
    @Autowired
    private PhoneServiceImpl phoneServiceimpl;
    @RequestMapping(value = "/status",method = RequestMethod.GET)
    public List<PhoneStatus> queryAllStatus(){
        List<PhoneStatus> phoneStatuses = phoneServiceimpl.queryAllStatus();
        return phoneStatuses;
    }
    @RequestMapping(value = "/{phoneStatusId}",method = RequestMethod.GET)
    public List<ClearCondition> queryClearConditionByStatusId(@PathVariable("phoneStatusId") int phoneStatusId){
        List<ClearCondition> clearConditions = phoneServiceimpl.queryClearConditionByStatusId(phoneStatusId);
        return clearConditions;
    }



}
