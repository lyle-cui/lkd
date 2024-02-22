package com.lkd.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 点位表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Node implements Serializable {

    private static final long serialVersionUID = 1L;


    @JsonAlias("nodeId")
    private Long id;

    /**
     * 点位名称
     */
    private String name;

    /**
     * 点位详细地址
     */
    private String addr;

    /**
     * 所在区域Id
     */
    private String areaCode;

    /**
     * 创建人id
     */
    private Integer createUserId;

    /**
     * 区域id
     */
    private Long regionId;

    /**
     * 商圈id
     */
    private Integer businessId;

    /**
     * 点位主Id
     */
    private Integer ownerId;

    /**
     * 点位主名称
     */
    private String ownerName;

    /**
     * 更改时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
