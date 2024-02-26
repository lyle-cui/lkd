package com.lkd.controller;

import com.lkd.entity.User;
import com.lkd.result.PageBean;
import com.lkd.result.Result;
import com.lkd.service.UserService;
import com.lkd.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user-service/user")
public class UserController {
    @Autowired
    private UserService userService;

    //用户搜索
    @GetMapping("/search")
    public Result search(Integer pageIndex, Integer pageSize, String userName) {
        PageBean<UserVO> pageBean = userService.search(pageIndex, pageSize, userName);
        return Result.success(pageBean);
    }

    //新增用户
    @PostMapping
    public Result save(@RequestBody User user) {
        boolean result = userService.save(user);
        return Result.success(result);
    }
}
