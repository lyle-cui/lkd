package com.lkd.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface NodeMapper {
    // 根据区域id查询节点数量
    @Select("select count(*) from tb_node where region_id = #{regionId}")
    Integer countByRegionId(Long regionId);
}
