package com.lkd.mapper;

import com.lkd.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoleMapper {
    //根据id查询角色
    @Select("select * from tb_role where role_id=#{roleId}")
    Role findById(Integer roleId);

    //查询所有角色
    @Select("select * from tb_role")
    List<Role> findList();
}
