package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 商圈表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Business implements Serializable {

    private static final long serialVersionUID = 1L;

    
    private Integer id;

    /**
     * 商圈名称
     */
    private String name;


}
