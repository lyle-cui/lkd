package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 按月统计各公司销售情况表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OrderMonthCollect implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    
    private Long id;

    /**
     * 合作商Id
     */
    private Integer ownerId;

    /**
     * 合作商名称
     */
    private String ownerName;

    /**
     * 区域Id
     */
    private Integer areaId;

    /**
     * 订单总金额
     */
    private Long orderTotalMoney;

    /**
     * 订单总数
     */
    private Long orderTotalCount;

    /**
     * 月份
     */
    private Integer month;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 地区名称
     */
    private String areaName;


}
