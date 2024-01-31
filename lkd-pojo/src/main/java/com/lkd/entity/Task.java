package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 工单表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 工单编号
     */
    private Long taskId;

    /**
     * 工单编号
     */
    private String taskCode;

    /**
     * 工单状态
     */
    private Integer taskStatus;

    /**
     * 创建类型 0：自动 1：手动
     */
    private Integer createType;

    /**
     * 售货机编码
     */
    private String innerCode;

    /**
     * 执行人id
     */
    private Integer userId;

    /**
     * 执行人名称
     */
    private String userName;

    /**
     * 所属区域Id
     */
    private Long regionId;

    /**
     * 描述
     */
    private String desc;

    /**
     * 工单类型id
     */
    private Integer productTypeId;

    /**
     * 计划完成时间
     */
    private LocalDateTime expect;

    /**
     * 指派人Id
     */
    private Integer assignorId;

    /**
     * 地址
     */
    private String addr;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
