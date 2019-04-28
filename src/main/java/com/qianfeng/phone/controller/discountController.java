package com.qianfeng.phone.controller;

import com.qianfeng.phone.commons.Message;
import com.qianfeng.phone.service.impl.PhoneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/discount")
public class discountController {
    @Autowired
    private PhoneServiceImpl phoneServiceimpl;
    @RequestMapping("money")
    @ResponseBody
    public List<Object> queryDiscountByClearId(int gid, int package_id, String property_ids, String desc_ids, String pj_ids, HttpSession session){
        String str  = property_ids+","+desc_ids+","+pj_ids;
        String strr[] = str.split(",");
        int discount =0;
        for(String a:strr){
            int b = Integer.parseInt(a);
            if(b!=0){
                discount += phoneServiceimpl.queryDiscountByClearId(b);
            }
        }
        int c = queryTypePrice(gid)-discount;
        if(c<5000){
            c=5000;
        }
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);

        Message message = new Message();
        message.setPhonePrice(c);
        message.setPhoneTypeId(gid);
        message.setUserId(package_id);
        String d = UUID.randomUUID().toString().replace("-","");
        session.setAttribute(d,message);
        list.add(d);
        return list;
    }
    //查询该手机类型的原始价格
    public int queryTypePrice(int phoneTypeId){
        int typeMoney = phoneServiceimpl.queryTypeMoney(phoneTypeId);
        return typeMoney;
    }
    public void tomoney(){

    }
}
