package com.lkd.controller;

import com.lkd.result.PageBean;
import com.lkd.result.Result;
import com.lkd.service.UserService;
import com.lkd.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
