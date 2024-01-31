package com.lkd.vo;

import lombok.Data;

@Data
public class LoginUserVo {
   private Integer userId;
   private String userName;
   private String roleCode;
   private String regionId;
   private String token;
}
