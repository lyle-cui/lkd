package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 工单无法完成原因
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UndoReason implements Serializable {

    private static final long serialVersionUID = 1L;

    
    private Integer id;

    /**
     * 原因描述
     */
    private String describe;


}
