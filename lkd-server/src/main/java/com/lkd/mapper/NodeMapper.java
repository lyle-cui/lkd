package com.lkd.mapper;

import com.lkd.vo.NodeVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NodeMapper {
    // 根据区域id查询节点数量
    @Select("select count(*) from tb_node where region_id = #{regionId}")
    Integer countByRegionId(Long regionId);

    // 查询节点
    List<NodeVO> search(String name, Integer regionId);
}
