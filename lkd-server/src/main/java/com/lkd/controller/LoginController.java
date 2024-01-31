package com.lkd.controller;


import com.lkd.constant.JwtClaimsConstant;
import com.lkd.dto.LoginDto;
import com.lkd.entity.User;
import com.lkd.properties.JwtProperties;
import com.lkd.result.Result;
import com.lkd.service.UserService;
import com.lkd.utils.JwtUtil;
import com.lkd.vo.LoginUserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/user-service/user")
@Slf4j
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private JwtProperties jwtProperties;

    @PostMapping("/login")
    public Result login(@RequestBody LoginDto dto) {
        User user = userService.login(dto);
        //生成token
        HashMap<String, Object> claims = new HashMap<>();
        claims.put(JwtClaimsConstant.USER_ID, user.getId());
        claims.put(JwtClaimsConstant.USERNAME, user.getUserName());
        String token = JwtUtil.createJWT(jwtProperties.getSecret(), jwtProperties.getTtl(), claims);
        //封装 LoginUserVo
        LoginUserVo loginUserVo = LoginUserVo.builder()
                .userId(user.getId())
                .userName(user.getUserName())
                .roleCode(user.getRoleCode())
                .regionId(String.valueOf(user.getRegionId()))
                .token(token)
                .build();
        //返回结果 LoginUserVo
        return Result.success(loginUserVo);
    }
}
