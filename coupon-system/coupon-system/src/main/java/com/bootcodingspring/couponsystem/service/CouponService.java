package com.bootcodingspring.couponsystem.service;

import com.bootcodingspring.couponsystem.helper.CouponHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CouponService {
    @Autowired
    private CouponHelper couponHelper;

    public String getNewCoupon(){
        return couponHelper.newCoupon();

    }

    public List<String> getNewCoupon(int quantity){
        List<String> coupons = new ArrayList<>();
        for(int i = 0; i < quantity; i++){
            String newCoupon = couponHelper.newCoupon();
            coupons.add(newCoupon);
        }
        return coupons;

    }

    //feature
    //get new copu[an

}
