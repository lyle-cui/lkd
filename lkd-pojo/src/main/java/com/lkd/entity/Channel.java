package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 售货机货道表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Channel implements Serializable {

    private static final long serialVersionUID = 1L;


    private Long channelId;

    /**
     * 货道编号
     */
    private String channelCode;

    /**
     * 商品Id
     */
    private Long skuId;

    /**
     * 售货机Id
     */
    private Long vmId;

    /**
     * 售货机软编号
     */
    private String innerCode;

    /**
     * 货道最大容量
     */
    private Integer maxCapacity;

    /**
     * 货道商品真实售价
     */
    private Integer price;

    /**
     * 货道当前容量
     */
    private Integer currentCapacity;

    /**
     * 上次补货时间
     */
    private LocalDateTime lastSupplyTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;


}
