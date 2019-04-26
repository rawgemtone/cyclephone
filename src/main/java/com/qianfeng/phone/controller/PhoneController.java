package com.qianfeng.phone.controller;

import com.qianfeng.phone.dto.PhoneBrand;
import com.qianfeng.phone.dto.PhoneType;
import com.qianfeng.phone.service.impl.PhoneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/brand")
public class PhoneController {
    @Autowired
    private PhoneServiceImpl phoneServiceimpl;

    @RequestMapping(value = "/brand",method = RequestMethod.GET)
    public List<PhoneBrand> queryallbrand(){
        List<PhoneBrand> brands = phoneServiceimpl.queryAllBrand();
        System.out.println("--------------------------");
        return brands;
    }
    @RequestMapping(value = "/{brandId}",method = RequestMethod.GET)
    public List<PhoneType> queryTypeByBrandId(@PathVariable("brandId") int brandId){
        List<PhoneType> types = phoneServiceimpl.queryTypeByBrandId(brandId);
        return types;
    }



}
