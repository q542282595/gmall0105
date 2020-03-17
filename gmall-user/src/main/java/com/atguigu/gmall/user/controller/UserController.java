package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UserMember;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/index")
    public String index()
    {
        return "hello world";
    }
    @GetMapping("/getAllUser")
    public List<UserMember> getAllUser()
    {
        return userService.getAllUser();
    }
}
