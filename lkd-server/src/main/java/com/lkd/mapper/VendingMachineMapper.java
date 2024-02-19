package com.lkd.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface VendingMachineMapper {
    @Select("select count(*) from tb_vending_machine where owner_id = #{ownerId}")
    Integer countByOwnerId(Integer ownerId);
}
