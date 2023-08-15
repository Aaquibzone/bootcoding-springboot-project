package com.bootcodingspring.couponsystem.helper;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CouponHelper {

        public String newCoupon(){
            return UUID.randomUUID().toString();
        }
}
