package com.lkd.mapper;

import com.lkd.entity.Node;
import com.lkd.vo.NodeVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NodeMapper {
    // 根据区域id查询点位数量
    @Select("select count(*) from tb_node where region_id = #{regionId}")
    Integer countByRegionId(Long regionId);

    // 查询点位
    List<NodeVO> search(String name, Integer regionId);

    //新增点位
    @Insert("insert into tb_node values (null,#{name},#{addr},#{areaCode},#{createUserId},#{regionId},#{businessId}," +
            "#{ownerId},#{ownerName},now(),now())")
    boolean save(Node node);

    //更新点位
    boolean update(Node node);

    //删除点位
    @Delete("delete from tb_node where id = #{nodeId}")
    boolean delete(Long nodeId);
}
