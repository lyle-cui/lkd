package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 售货机状态信息
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class VmStatusInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    
    private Long id;

    /**
     * 售货机编号
     */
    private String innerCode;

    /**
     * 售货机状态码
     */
    private String statusCode;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 发生时间
     */
    private LocalDateTime utime;

    /**
     * 维修员
     */
    private String operaterName;


}
