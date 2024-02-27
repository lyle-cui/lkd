package com.lkd.service.impl;

import com.lkd.mapper.ReportMapper;
import com.lkd.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportMapper reportMapper;


    //订单数量
    @Override
    public Integer countOrder(LocalDateTime start, LocalDateTime end) {
        return reportMapper.countOrder(start, end);
    }

    //统计销售额
    @Override
    public Double sumOrderAmount(LocalDateTime start, LocalDateTime end) {
        return reportMapper.sumOrderAmount(start, end);
    }
}
