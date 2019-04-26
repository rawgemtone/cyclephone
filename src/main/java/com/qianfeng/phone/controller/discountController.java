package com.qianfeng.phone.controller;

import com.qianfeng.phone.service.impl.PhoneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/discount")
public class discountController {
    @Autowired
    private PhoneServiceImpl phoneServiceimpl;
    public int queryDiscountByClearId(int clearConditionId){
        int discount = phoneServiceimpl.queryDiscountByClearId(clearConditionId);
        return discount;
    }
}
