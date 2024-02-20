package com.lkd.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lkd.entity.Business;
import com.lkd.entity.Region;
import com.lkd.mapper.BusinessMapper;
import com.lkd.mapper.NodeMapper;
import com.lkd.mapper.RegionMapper;
import com.lkd.mapper.VendingMachineMapper;
import com.lkd.result.PageBean;
import com.lkd.service.RegionService;
import com.lkd.vo.NodeVO;
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
    @Autowired
    private VendingMachineMapper vendingMachineMapper;
    @Autowired
    private BusinessMapper businessMapper;

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

    //区域更新
    @Override
    public boolean update(Region region) {
        return regionMapper.update(region);
    }

    //根据区域id查询该区域下的点位列表
    @Override
    public PageBean<NodeVO> searchNode(Integer regionId, Integer pageIndex, Integer pageSize) {
        //开启分页
        PageHelper.startPage(pageIndex, pageSize);
        //查询点位列表
        List<NodeVO> nodeVOList = nodeMapper.search(regionId);
        Page<NodeVO> page = (Page<NodeVO>) nodeVOList;
        //查询区域信息
        RegionVO region = regionMapper.findById(regionId);
        region.setNodeCount(nodeVOList.size());
        //遍历点位列表
        for (NodeVO nodeVO : nodeVOList) {
            //设置区域信息
            nodeVO.setRegion(region);
            //查询设备数量
            Long nodeId = nodeVO.getId();
            Integer vmCount = vendingMachineMapper.countByNodeId(nodeId);
            nodeVO.setVmCount(vmCount);
            //查询商圈信息
            Integer businessId = nodeVO.getBusinessId();
            Business business = businessMapper.findById(businessId);
            nodeVO.setBusinessType(business);
        }
        return new PageBean<>(pageIndex, pageSize, (long) page.getPages(), page.getTotal(), nodeVOList);
    }
}
