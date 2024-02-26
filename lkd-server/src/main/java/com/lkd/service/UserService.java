package com.lkd.service;


import com.lkd.dto.LoginDto;
import com.lkd.entity.User;
import com.lkd.result.PageBean;
import com.lkd.vo.UserVO;

public interface UserService {
    //用户登录
    User login(LoginDto dto);

    //分页查询
    PageBean<UserVO> search(Integer pageIndex, Integer pageSize, String userName);
}
