package com.lkd.service;


import com.lkd.dto.LoginDto;
import com.lkd.entity.User;

public interface UserService {
    //用户登录
    User login(LoginDto dto);
}
