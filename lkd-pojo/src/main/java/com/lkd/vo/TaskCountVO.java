package com.lkd.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskCountVO {
    private Integer total;
    private Integer completedTotal;
    private Integer cancelTotal;
    private Integer progressTotal;
    private Integer workerCount;
    private Boolean repair;
    private LocalDateTime date;
}
