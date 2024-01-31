package com.lkd.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginUserVo {
   private Integer userId;
   private String userName;
   private String roleCode;
   private String regionId;
   private String token;
}
