package com.zhenglei.dynamicdatasource.controller;

import com.zhenglei.dynamicdatasource.domain.User;
import com.zhenglei.dynamicdatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/1/selectById")
    public User selectById1(String id){
        return userService.selectById1(id);
    }
    @RequestMapping("/2/selectById")
    public User selectById2(String id){
        return userService.selectById2(id);
    }
    @RequestMapping("/3/selectById")
    public User selectById3(String id){
        return userService.selectById3(id);
    }
}
