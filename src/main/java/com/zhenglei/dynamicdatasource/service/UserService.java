package com.zhenglei.dynamicdatasource.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.zhenglei.dynamicdatasource.domain.User;
import com.zhenglei.dynamicdatasource.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@DS("master")
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    public User selectById1(String id){
         return userMapper.selectById(id);
    }
    @DS("slave_1")
    public User selectById2(String id){
         return userMapper.selectById(id);
    }
    @DS("slave_2")
    public User selectById3(String id){
         return userMapper.selectById(id);
    }
}
