package com.lkd.controller;

import com.lkd.entity.Role;
import com.lkd.result.Result;
import com.lkd.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user-service/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    // 查询角色列表
    @GetMapping
    public Result findList(){
        List<Role> list = roleService.findList();
        return Result.success(list);
    }
}
