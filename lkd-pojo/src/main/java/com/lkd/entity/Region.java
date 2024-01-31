package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 运营区域
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;

    
    private Long id;

    /**
     * 区域名称
     */
    private String name;

    /**
     * 备注
     */
    private String remark;


}
