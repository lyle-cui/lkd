package com.lkd.service.impl;

import com.lkd.mapper.TaskMapper;
import com.lkd.service.TaskService;
import com.lkd.vo.TaskCountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskMapper taskMapper;

    //工单统计
    @Override
    public List<TaskCountVO> taskReportInfo(LocalDateTime start, LocalDateTime end) {
        //准备返回数据
        //运维工单
        Integer total = taskMapper.countByTypeAndStatus(start, end, 1, null);//全部工单
        Integer completedTotal = taskMapper.countByTypeAndStatus(start, end, 1, 4);//已完成工单
        Integer cancelTotal = taskMapper.countByTypeAndStatus(start, end, 1, 3);//取消工单
        Integer progressTotal = taskMapper.countByTypeAndStatus(start, end, 1, 2);//进行中工单
        TaskCountVO vo = TaskCountVO.builder()
                .total(total)
                .completedTotal(completedTotal)
                .cancelTotal(cancelTotal)
                .progressTotal(progressTotal)
                .workerCount(0)
                .repair(true)
                .date(LocalDateTime.now())
                .build();

        //运营工单
        Integer total2 = taskMapper.countByTypeAndStatus(start, end, 2, null);//全部工单
        Integer completedTotal2 = taskMapper.countByTypeAndStatus(start, end, 2, 4);//已完成工单
        Integer cancelTotal2 = taskMapper.countByTypeAndStatus(start, end, 2, 3);//取消工单
        Integer progressTotal2 = taskMapper.countByTypeAndStatus(start, end, 2, 2);//进行中工单

        TaskCountVO vo2 = TaskCountVO.builder()
                .total(total2)
                .completedTotal(completedTotal2)
                .cancelTotal(cancelTotal2)
                .progressTotal(progressTotal2)
                .workerCount(0)
                .repair(false)
                .date(LocalDateTime.now())
                .build();
        //封装数据
        List<TaskCountVO> list = new ArrayList<>();
        list.add(vo);
        list.add(vo2);
        return list;
    }
}
