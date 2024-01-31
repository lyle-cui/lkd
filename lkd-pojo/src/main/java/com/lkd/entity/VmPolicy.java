package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 机器和策略关联表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class VmPolicy implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */

    private Long id;

    /**
     * 售货机id
     */
    private Long vmId;

    /**
     * 售货机编号
     */
    private String innerCode;

    /**
     * 策略id
     */
    private Integer policyId;

    /**
     * 策略名称
     */
    private String policyName;

    /**
     * 折扣
     */
    private Integer discount;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
