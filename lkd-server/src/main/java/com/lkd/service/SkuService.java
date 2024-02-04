package com.lkd.service;

import com.lkd.entity.Sku;
import com.lkd.result.PageBean;
import com.lkd.vo.SkuVO;

//商品管理
public interface SkuService {
    //分页查询
    PageBean<SkuVO> search(Integer pageIndex, Integer pageSize, String skuName);

    //保存
    Boolean save(Sku sku);
}
