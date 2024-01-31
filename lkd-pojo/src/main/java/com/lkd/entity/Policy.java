package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 策略表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Policy implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 策略id
     */
    private Integer policyId;

    /**
     * 策略名称
     */
    private String policyName;

    /**
     * 折扣，如：80代表8折
     */
    private Integer discount;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;


}
