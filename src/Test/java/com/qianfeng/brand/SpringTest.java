package com.qianfeng.brand;

import com.qianfeng.phone.dto.PhoneStatus;
import com.qianfeng.phone.dto.PhoneType;
import com.qianfeng.phone.service.PhoneService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringTest {
    @Autowired
    private PhoneService phoneService;
//    @Test
//    public void testbrand(){
//        List<PhoneBrand> brands = phoneService.queryAllBrand();
//        System.out.println(brands);
//    }
    @Test
    public void testtype(){
        List<PhoneType> types = phoneService.queryTypeByBrandId(2);
        System.out.println(types);
    }
//    @Test
//    public void testStatus(){
//        List<PhoneStatus> statuses = phoneService.queryAllStatus();
//        System.out.println(statuses);
//    }
//    @Test
//    public void testclearCondition( ){
//        List<ClearCondition> clearConditions = phoneService.queryClearConditionByStatusId(1);
//        System.out.println(clearConditions);
//    }
//    @Autowired
//    private PhoneService phoneService;
//    @Test
//    public void test(){
//        List<PhoneStatus> statuses = phoneService.queryAllStatus(2);
//        System.out.println(statuses);
//    }
//    @Test
//    public void test1(){
//        int i = phoneService.queryDiscountByClearId(1);
//        System.out.println(i);
//    }

}
