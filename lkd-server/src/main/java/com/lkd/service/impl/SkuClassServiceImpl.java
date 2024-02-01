package com.lkd.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lkd.entity.SkuClass;
import com.lkd.mapper.SkuClassMapper;
import com.lkd.result.PageBean;
import com.lkd.service.SkuClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkuClassServiceImpl implements SkuClassService {
    @Autowired
    private SkuClassMapper skuClassMapper;

    //分类搜索
    @Override
    public PageBean<SkuClass> search(Integer pageIndex, Integer pageSize, String className) {
        PageHelper.startPage(pageIndex,pageSize);
        Page<SkuClass> page=(Page<SkuClass>) skuClassMapper.search(className);
        return new PageBean<>(pageIndex,pageSize, (long) page.getPages(),page.getTotal(),page.getResult());
    }

    //新增分类
    @Override
    public boolean save(SkuClass skuClass) {
        return skuClassMapper.save(skuClass);
    }

    //修改分类
    @Override
    public boolean update(SkuClass skuClass) {
        return skuClassMapper.update(skuClass);
    }

    //删除分类
    @Override
    public boolean deleteById(Integer classId) {
        return skuClassMapper.deleteById(classId);
    }
}
