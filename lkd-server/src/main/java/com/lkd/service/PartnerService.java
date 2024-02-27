package com.lkd.service;

import com.lkd.entity.Partner;
import com.lkd.result.PageBean;
import com.lkd.vo.PartnerVO;

public interface PartnerService {
    //分页条件查询
    PageBean<PartnerVO> search(Integer pageIndex, Integer pageSize, String name);

    //新增合作商
    boolean save(Partner partner);

    //根据id查询合作商详情
    PartnerVO findById(Integer id);

    //修改合作商
    boolean update(Partner partner);

    //删除合作商
    boolean delete(Integer id);

    //查询合作商数量
    Integer count();
}
