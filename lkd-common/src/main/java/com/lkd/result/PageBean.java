package com.lkd.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 封装分页查询结果
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageBean<T> implements Serializable {

    private Integer pageIndex; //当前页

    private Integer pageSize; //每页条数

    private Long totalPage; //总页数

    private long totalCount; //总记录数

    private List<T> currentPageRecords; //当前页数据集合

}
