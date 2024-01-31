package com.lkd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lkd.mapper")
public class LkdApplication {
    public static void main(String[] args) {
        SpringApplication.run(LkdApplication.class,args);
    }
}
