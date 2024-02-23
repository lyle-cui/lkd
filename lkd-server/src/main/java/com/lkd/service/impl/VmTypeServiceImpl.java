package com.lkd.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lkd.entity.VmType;
import com.lkd.mapper.VmTypeMapper;
import com.lkd.result.PageBean;
import com.lkd.service.VmTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VmTypeServiceImpl implements VmTypeService {
    @Autowired
    private VmTypeMapper vmTypeMapper;

    //根据条件分页查询
    @Override
    public PageBean<VmType> search(String name, Integer pageIndex, Integer pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        List<VmType> vmTypes = vmTypeMapper.search(name);
        Page<VmType> page = (Page<VmType>) vmTypes;
        return new PageBean<>(pageIndex, pageSize, (long) page.getPages(), page.getTotal(), vmTypes);
    }

    //新增设备类型
    @Override
    public boolean save(VmType vmType) {
        return vmTypeMapper.save(vmType);
    }
}
