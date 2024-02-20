package com.lkd.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lkd.entity.Region;
import com.lkd.mapper.NodeMapper;
import com.lkd.mapper.RegionMapper;
import com.lkd.result.PageBean;
import com.lkd.service.RegionService;
import com.lkd.vo.RegionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {
    @Autowired
    private RegionMapper regionMapper;
    @Autowired
    private NodeMapper nodeMapper;

    //分页查询
    @Override
    public PageBean<RegionVO> search(Integer pageIndex, Integer pageSize, String name) {
        //分页查询
        PageHelper.startPage(pageIndex, pageSize);
        List<RegionVO> regionVOList = regionMapper.search(name);
        for (RegionVO regionVO : regionVOList) {
            Long regionId = regionVO.getId();
            //查询节点数量
            Integer nodeCount = nodeMapper.countByRegionId(regionId);
            regionVO.setNodeCount(nodeCount);
        }
        Page<RegionVO> page = (Page<RegionVO>) regionVOList;
        return new PageBean<>(pageIndex, pageSize, (long) page.getPages(), page.getTotal(), regionVOList);
    }

    //区域保存
    @Override
    public boolean save(Region region) {
        return regionMapper.save(region);
    }
}
