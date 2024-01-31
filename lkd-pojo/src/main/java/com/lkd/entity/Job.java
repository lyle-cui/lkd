package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 自动补货任务
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Job implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    
    private Integer id;

    /**
     * 警戒值百分比
     */
    private Integer alertValue;


}
