package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 订单
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    
    private Long id;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 第三方平台单号
     */
    private String thirdNo;

    /**
     * 机器编号
     */
    private String innerCode;

    /**
     * skuId
     */
    private Long skuId;

    /**
     * 商品名称
     */
    private String skuName;

    /**
     * 商品类别Id
     */
    private Integer classId;

    /**
     * 订单状态:0-创建;1-支付完成;2-出货成功;3-出货失败;4-失效
     */
    private Integer status;

    /**
     * 支付金额
     */
    private Integer amount;

    /**
     * 商品金额
     */
    private Integer price;

    /**
     * 支付类型，1支付宝 2微信
     */
    private String payType;

    /**
     * 支付状态，0-未支付;1-支付完成;2-退款中;3-退款完成
     */
    private Integer payStatus;

    /**
     * 合作商账单金额
     */
    private Integer bill;

    /**
     * 点位地址
     */
    private String addr;

    /**
     * 所属区域Id
     */
    private Long regionId;

    private String regionName;

    /**
     * 所属商圈Id
     */
    private Integer businessId;

    /**
     * 商圈名称
     */
    private String businessName;

    /**
     * 合作商Id
     */
    private Integer ownerId;

    private String openId;

    /**
     * 点位Id
     */
    private Long nodeId;

    private String nodeName;

    /**
     * 取消原因
     */
    private String cancelDesc;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
