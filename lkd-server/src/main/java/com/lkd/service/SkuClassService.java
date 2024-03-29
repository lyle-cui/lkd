package com.lkd.service;

import com.lkd.entity.SkuClass;
import com.lkd.result.PageBean;

public interface SkuClassService {
    //分类搜索
    PageBean<SkuClass> search(Integer pageIndex, Integer pageSize, String className);

    //新增分类
    boolean save(SkuClass skuClass);

    //修改分类
    boolean update(SkuClass skuClass);

    //删除分类
    boolean deleteById(Integer classId);
}
