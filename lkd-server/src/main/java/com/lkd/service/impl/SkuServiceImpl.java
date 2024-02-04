package com.lkd.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lkd.constant.StatusConstant;
import com.lkd.entity.Sku;
import com.lkd.mapper.SkuMapper;
import com.lkd.result.PageBean;
import com.lkd.service.SkuService;
import com.lkd.vo.SkuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

//商品管理
@Service
public class SkuServiceImpl implements SkuService {
    @Autowired
    private SkuMapper skuMapper;

    //分页查询
    @Override
    public PageBean<SkuVO> search(Integer pageIndex, Integer pageSize, String skuName) {
        PageHelper.startPage(pageIndex, pageSize);
        Page<SkuVO> page = (Page<SkuVO>) skuMapper.search(skuName);
        return new PageBean<>(pageIndex, pageSize, (long) page.getPages(), page.getTotal(), page.getResult());
    }

    //保存
    @Override
    public Boolean save(Sku sku) {
        sku.setIsDiscount(false);
        sku.setCreateTime(LocalDateTime.now());
        sku.setUpdateTime(LocalDateTime.now());
        return skuMapper.save(sku);
    }
}
