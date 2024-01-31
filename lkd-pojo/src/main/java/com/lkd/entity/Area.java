package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 区域表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Area implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 父Id
     */
    private Integer parentId;

    /**
     * 区域名称
     */
    private String areaName;

    /**
     * 地区编码
     */
    private String adCode;

    /**
     * 城市区号
     */
    private String cityCode;

    /**
     * 地区级别
     */
    private String areaLevel;
}
