package com.lkd.service.impl;


import com.lkd.dto.LoginDto;
import com.lkd.mapper.UserMapper;
import com.lkd.service.UserService;
import com.lkd.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserMapper userMapper;

    //用户登录
    @Override
    public User login(LoginDto dto) {
        return null;
    }
}
