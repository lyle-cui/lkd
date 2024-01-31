package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 售货机配置版本
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class VmCfgVersion implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long versionId;

    /**
     * 售货机Id
     */
    private Long vmId;

    /**
     * 售货机编号
     */
    private String innerCode;

    /**
     * 货道配置版本
     */
    private Long channelCfgVersion;

    /**
     * 基础配置版本
     */
    private Long basecfgVersion;

    /**
     * 商品配置版本
     */
    private Long skuCfgVersion;

    /**
     * 价格配置版本
     */
    private Long priceCfgVersion;

    /**
     * 补货版本
     */
    private Long supplyVersion;


}
