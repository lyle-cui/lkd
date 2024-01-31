package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 工单任务状态
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TaskStatusType implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer statusId;

    private String statusName;
}
