package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 商品类别表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SkuClass implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer classId;

    /**
     * 类别名称
     */
    private String className;

    /**
     * 上级id
     */
    private Integer parentId;


}
