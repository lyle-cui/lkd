package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class StatusType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    
    private Integer id;

    /**
     * 状态代码
     */
    private String statusCode;

    /**
     * 状态描述
     */
    private String descr;


}
