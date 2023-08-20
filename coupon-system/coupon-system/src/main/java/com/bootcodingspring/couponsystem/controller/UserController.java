package com.bootcodingspring.couponsystem.controller;


import com.bootcoding.spring.coupon.model.User;
import com.bootcoding.spring.coupon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public String register(@RequestBody List<User> users){
        userService.saveUser(users);
        return "SUCCESS";
    }

    }
