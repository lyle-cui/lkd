package com.lkd.service;

import com.lkd.entity.VmType;
import com.lkd.result.PageBean;

import java.util.List;

public interface VmTypeService {
    //分页查询
    PageBean<VmType> search(String name, Integer pageIndex, Integer pageSize);
}
