package com.lkd.service;

import com.lkd.result.PageBean;
import com.lkd.vo.RegionVO;

public interface RegionService {
    //分页查询
    PageBean<RegionVO> search(Integer pageIndex, Integer pageSize, String name);
}
