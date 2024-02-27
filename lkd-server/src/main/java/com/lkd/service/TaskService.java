package com.lkd.service;

import com.lkd.vo.TaskCountVO;

import java.time.LocalDateTime;
import java.util.List;

public interface TaskService {
    //工单统计
    List<TaskCountVO> taskReportInfo(LocalDateTime start, LocalDateTime end);
}
