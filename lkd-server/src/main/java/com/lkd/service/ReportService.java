package com.lkd.service;

import java.time.LocalDateTime;

public interface ReportService {
    // 订单数量
    Integer countOrder(LocalDateTime start, LocalDateTime end);
}
