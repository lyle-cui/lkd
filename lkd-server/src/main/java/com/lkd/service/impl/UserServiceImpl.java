package com.lkd.service.impl;


import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.lkd.constant.MessageConstant;
import com.lkd.constant.StatusConstant;
import com.lkd.dto.LoginDto;
import com.lkd.exception.BusinessException;
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
        String loginName = dto.getLoginName();
        String password = dto.getPassword();
        //验证用户是否存在
        User user = userMapper.findByLoginName(loginName);
        if (user == null) {
            throw new BusinessException(MessageConstant.ACCOUNT_NOT_FOUND);
        }
        //验证密码是否正确
        String md5 = SecureUtil.md5(password);
        if (!StrUtil.equals(md5, user.getPassword())) {
            throw new BusinessException(MessageConstant.PASSWORD_ERROR);
        }
        //判断用户状态是否禁用
        if (user.getStatus() == StatusConstant.DISABLE) {
            throw new BusinessException(MessageConstant.ACCOUNT_LOCKED);
        }
        return user;
    }
}
