package com.lkd.vo;


import com.lkd.entity.Business;
import com.lkd.entity.Node;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NodeVO extends Node {
    private Integer vmCount;
    private RegionVO region;
    private Business businessType;
}
