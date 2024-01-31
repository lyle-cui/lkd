package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 合作商表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Partner implements Serializable {

    private static final long serialVersionUID = 1L;

    
    private Integer id;

    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 账号
     */
    private String account;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 联系电话
     */
    private String phone;

    private String email;

    /**
     * 所在省
     */
    private String province;

    /**
     * 所在市
     */
    private String city;

    /**
     * 区县
     */
    private String county;

    /**
     * 详细地址
     */
    private String addr;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 分成比例
     */
    private Integer ratio;

    /**
     * 状态
     */
    private Integer status;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
