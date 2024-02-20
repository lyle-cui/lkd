package com.lkd.mapper;

import com.lkd.entity.Business;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BusinessMapper {
    // 查询商圈信息
    @Select("select * from tb_business where id = #{businessId}")
    Business findById(Integer businessId);
}
