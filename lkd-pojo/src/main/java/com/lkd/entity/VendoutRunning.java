package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 出货流水
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class VendoutRunning implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    
    private Long id;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 售货机编号
     */
    private String innerCode;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 商品编号
     */
    private Long skuId;

    /**
     * 商品名称
     */
    private String skuName;

    /**
     * 价格
     */
    private Integer price;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
