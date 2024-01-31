package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * 合作商订单汇总表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OrderCollect implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Id
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
     * 日订单收入总金额(平台端总数)
     */
    private Long orderTotalMoney;

    /**
     * 发生日期
     */
    private LocalDate date;

    /**
     * 分成总金额
     */
    private Integer totalBill;

    /**
     * 当日点位营收
     */
    private Integer nodeAmount;

    private Long nodeId;

    /**
     * 点位
     */
    private String nodeName;

    /**
     * 订单数
     */
    private Integer orderCount;

    /**
     * 分成比例
     */
    private Integer ratio;


}
