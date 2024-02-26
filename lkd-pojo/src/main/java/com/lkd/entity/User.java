package com.lkd.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.lkd.serializer.BooleanToIntegerDeserializer;
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

    @JsonDeserialize(using = BooleanToIntegerDeserializer.class)
    private Integer status;

    private String roleCode;

    private String mobile;

    private String image;

}
