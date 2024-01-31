package com.lkd.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 工单详情，只有补货工单才有
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TaskDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long detailsId;

    /**
     * 工单Id
     */
    private Long taskId;

    /**
     * 货道编号
     */
    private String channelCode;

    /**
     * 补货期望容量
     */
    private Integer expectCapacity;

    /**
     * 商品Id
     */
    private Long skuId;

    private String skuName;

    private String skuImage;


}
