package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 商品表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Sku implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long skuId;

    /**
     * 商品名称
     */
    private String skuName;

    /**
     * 商品图片
     */
    private String skuImage;

    /**
     * 基础价格
     */
    private Integer price;

    /**
     * 商品类别Id
     */
    private Integer classId;

    /**
     * 是否打折促销
     */
    private Boolean isDiscount;

    /**
     * 净含量
     */
    private String unit;

    private String brandName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;


}
