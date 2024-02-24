package com.lkd.service;

import com.lkd.result.PageBean;
import com.lkd.vo.VendingMachineVO;

import java.util.List;

public interface VendingMachineService {
    //分页条件查询
    PageBean<VendingMachineVO> search(Integer pageIndex, Integer pageSize, String innerCode);
}
