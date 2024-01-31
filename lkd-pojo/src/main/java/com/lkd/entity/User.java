package com.lkd.entity;

import lombok.Data;

@Data
public class User {

    private Integer id;

    private Integer roleId;

    private String userName;

    private String loginName;

    private String password;

    private Integer regionId;

    private String regionName;

    private String secret;

    private Integer status;

    private String roleCode;

    private String mobile;

    private String image;

}
