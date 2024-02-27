package com.lkd.controller;

import com.lkd.result.Result;
import com.lkd.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/order-service/report")
public class ReportController {
    @Autowired
    private ReportService reportService;

    // 订单统计
    @GetMapping("/orderCount")
    public Result orderCount(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime start,
                             @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime end) {
        Integer count = reportService.countOrder(start, end);
        return Result.success(count);
    }
}
