package com.lkd.service.impl;


import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lkd.constant.MessageConstant;
import com.lkd.constant.PasswordConstant;
import com.lkd.constant.StatusConstant;
import com.lkd.dto.LoginDto;
import com.lkd.entity.Role;
import com.lkd.exception.BusinessException;
import com.lkd.mapper.RoleMapper;
import com.lkd.mapper.UserMapper;
import com.lkd.result.PageBean;
import com.lkd.service.UserService;
import com.lkd.entity.User;
import com.lkd.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

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

    //用户搜索
    @Override
    public PageBean<UserVO> search(Integer pageIndex, Integer pageSize, String userName) {
        //分页查询
        PageHelper.startPage(pageIndex, pageSize);
        List<UserVO> list = userMapper.search(userName);
        //查询角色信息
        for (UserVO userVO : list) {
            Integer roleId = userVO.getRoleId();
            Role role = roleMapper.findById(roleId);
            userVO.setRole(role);
        }
        Page<UserVO> page = (Page<UserVO>) list;
        return new PageBean<>(pageIndex, pageSize, (long) page.getPages(), page.getTotal(), list);
    }

    //新增用户
    @Override
    public boolean save(User user) {
        //设置默认密码
        user.setPassword(SecureUtil.md5(PasswordConstant.DEFAULT_PASSWORD));
        //补齐角色code
        Role role = roleMapper.findById(user.getRoleId());
        user.setRoleCode(role.getRoleCode());

        return userMapper.save(user);
    }

    //修改用户
    @Override
    public boolean update(User user) {
        return userMapper.update(user);
    }

    //删除用户
    @Override
    public boolean deleteById(Integer id) {
        return userMapper.deleteById(id);
    }
}
