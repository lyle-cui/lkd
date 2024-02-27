package com.lkd.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;

@Mapper
public interface ReportMapper {
    //统计订单数量
    @Select("select count(*) from tb_order where create_time between #{start} and #{end}")
    Integer countOrder(LocalDateTime start, LocalDateTime end);
}
