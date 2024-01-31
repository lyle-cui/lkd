package com.lkd.controller;


import com.lkd.dto.LoginDto;
import com.lkd.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user-service/user")
@Slf4j
public class LoginController {

    @PostMapping("/login")
    public Result login(@RequestBody LoginDto dto){
		
		//返回结果 LoginUserVo
        return Result.success(null);
    }
}
