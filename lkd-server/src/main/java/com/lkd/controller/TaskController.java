package com.lkd.controller;

import com.lkd.result.Result;
import com.lkd.service.TaskService;
import com.lkd.vo.TaskCountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/task-service/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    //工单统计
    @GetMapping("/taskReportInfo/{start}/{end}")
    public Result taskReportInfo(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime start,
                                 @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime end) {
        List<TaskCountVO> list = taskService.taskReportInfo(start, end);
        return Result.success(list);
    }
}
