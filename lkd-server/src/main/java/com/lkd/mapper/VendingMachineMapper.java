package com.lkd.mapper;

import com.lkd.vo.VendingMachineVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface VendingMachineMapper {
    //根据合作商id查询点位下售货机数量
    @Select("select count(*) from tb_vending_machine where owner_id = #{ownerId}")
    Integer countByOwnerId(Integer ownerId);

    //根据点位id查询点位下售货机数量
    @Select("select count(*) from tb_vending_machine where node_id = #{nodeId}")
    Integer countByNodeId(Long nodeId);

    //根据点位id删除售货机
    @Delete("delete from tb_vending_machine where node_id = #{nodeId}")
    boolean deleteByNodeId(Long nodeId);

    //根据点位id查询售货机
    @Select("select * from tb_vending_machine where node_id = #{nodeId}")
    List<VendingMachineVO> vmListByNodeId(Long nodeId);

    //条件查询
    List<VendingMachineVO> vmListByInnerCode(String innerCode);
}
