package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * 工单按日统计表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TaskCollect implements Serializable {

    private static final long serialVersionUID = 1L;

    
    private Integer id;

    /**
     * 当日工单完成数
     */
    private Integer finishCount;

    /**
     * 当日进行中的工单数
     */
    private Integer progressCount;

    /**
     * 当日取消工单数
     */
    private Integer cancelCount;

    /**
     * 汇总的日期
     */
    private LocalDate collectDate;


}
