package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 工单类型
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TaskType implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer typeId;

    private String typeName;

    /**
     * 工单类型。1:维修工单;2:运营工单
     */
    private Integer type;


}
