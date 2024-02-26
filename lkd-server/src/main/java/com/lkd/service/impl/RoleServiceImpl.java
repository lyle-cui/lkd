package com.lkd.service.impl;

import com.lkd.entity.Role;
import com.lkd.mapper.RoleMapper;
import com.lkd.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    // 查询所有角色
    @Override
    public List<Role> findList() {
        return roleMapper.findList();
    }
}
