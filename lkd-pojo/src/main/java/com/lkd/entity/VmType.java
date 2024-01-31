package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 售货机类型表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class VmType implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer typeId;

    /**
     * 行数
     */
    private Integer vmRow;

    /**
     * 列数
     */
    private Integer vmCol;

    /**
     * 类型名
     */
    private String name;

    /**
     * 货道最大容量
     */
    private Integer channelMaxCapacity;

    /**
     * 型号
     */
    private String model;

    private String image;


}
