package com.lkd.vo;

import com.lkd.entity.SkuClass;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SkuVO {
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
    /**
     * 商品类别
     */
    private SkuClass skuClass;
}
