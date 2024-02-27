package com.lkd.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Mapper
public interface TaskMapper {
    // 根据工单类型和工单状态查询工单数量
    Integer countByTypeAndStatus(LocalDateTime start, LocalDateTime end, Integer type, Integer status);
}
