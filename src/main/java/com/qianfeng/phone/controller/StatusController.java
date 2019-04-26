package com.qianfeng.phone.controller;

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
    @ResponseBody
    @RequestMapping(value = "/{phoneTypeId}",method = RequestMethod.GET)
    public List<PhoneStatus> queryAllStatus(@PathVariable("phoneTypeId") int phoneTypeId){
        List<PhoneStatus> phoneStatuses = phoneServiceimpl.queryAllStatus(phoneTypeId);
        return phoneStatuses;
    }
//    @RequestMapping(value = "/status1",method = RequestMethod.GET)
//    public List<PhoneStatus> queryStatus1(){
//        List<PhoneStatus> phoneStatuses = phoneServiceimpl.queryAllStatus();
//        return phoneStatuses.subList(1,6);
//    }
//    @RequestMapping(value = "/status2",method = RequestMethod.GET)
//    public List<PhoneStatus> queryStatus2(){
//        List<PhoneStatus> phoneStatuses = phoneServiceimpl.queryAllStatus();
//        PhoneStatus status = phoneStatuses.get(7);
//        return (List<PhoneStatus>) status;
//
//    }
//    @RequestMapping(value = "/status3",method = RequestMethod.GET)
//    public List<PhoneStatus> queryStatus3(){
//        List<PhoneStatus> phoneStatuses = phoneServiceimpl.queryAllStatus();
//        return phoneStatuses.subList(8,11);
//    }



//    @RequestMapping(value = "/{phoneStatusId}",method = RequestMethod.GET)
//    public List<ClearCondition> queryClearConditionByStatusId(@PathVariable("phoneStatusId") int phoneStatusId){
//        List<ClearCondition> clearConditions = phoneServiceimpl.queryClearConditionByStatusId(phoneStatusId);
//        return clearConditions;
//    }



}
