package com.lkd.mapper;

import com.lkd.entity.VmType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface VmTypeMapper {
    //查询
    @Select("select * from tb_vm_type where type_id = #{vmTypeId}")
    VmType findById(Integer vmTypeId);
}
