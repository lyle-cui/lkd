package com.lkd.service;

import com.lkd.entity.Partner;
import com.lkd.result.PageBean;
import com.lkd.vo.PartnerVO;

public interface PartnerService {
    //分页条件查询
    PageBean<PartnerVO> search(Integer pageIndex, Integer pageSize, String name);

    //新增合作商
    boolean save(Partner partner);
}
