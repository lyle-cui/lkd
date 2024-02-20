package com.lkd.service;

import com.lkd.entity.Region;
import com.lkd.result.PageBean;
import com.lkd.vo.RegionVO;

public interface RegionService {
    //分页查询
    PageBean<RegionVO> search(Integer pageIndex, Integer pageSize, String name);

    //区域保存
    boolean save(Region region);

    //区域更新
    boolean update(Region region);
}
