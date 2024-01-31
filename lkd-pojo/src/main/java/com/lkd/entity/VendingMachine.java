package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 售货机
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class VendingMachine implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    
    private Long id;

    /**
     * 售货机类型
     */
    private Integer vmType;

    /**
     * 售货机软编号
     */
    private String innerCode;

    /**
     * 点位Id
     */
    private Long nodeId;

    /**
     * 售货机状态，0:未投放;1-运营;3-撤机
     */
    private Integer vmStatus;

    /**
     * 上次补货时间
     */
    private LocalDateTime lastSupplyTime;

    /**
     * 所在城市ID
     */
    private String cityCode;

    /**
     * 地区
     */
    private Integer areaId;

    /**
     * 创建人id
     */
    private Long createUserId;

    /**
     * 创建人姓名
     */
    private String createUserName;

    /**
     * 商圈Id
     */
    private Integer businessId;

    /**
     * 区域Id
     */
    private Long regionId;

    /**
     * 点位主Id
     */
    private Integer ownerId;

    /**
     * 所属合作商名称
     */
    private String ownerName;

    /**
     * 客户端连接Id,做emq认证用
     */
    private String clientId;

    /**
     * 经度
     */
    private Double longitudes;

    /**
     * 维度
     */
    private Double latitude;



}
