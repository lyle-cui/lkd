package com.lkd.vo;

import com.lkd.entity.Region;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegionVO {
    private Long id;
    private String name;
    private String remark;
    private Integer nodeCount;
}
