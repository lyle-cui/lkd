package com.lkd.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lkd.entity.Business;
import com.lkd.entity.VmType;
import com.lkd.mapper.*;
import com.lkd.result.PageBean;
import com.lkd.service.VendingMachineService;
import com.lkd.vo.NodeVO;
import com.lkd.vo.RegionVO;
import com.lkd.vo.VendingMachineVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VendingMachineServiceImpl implements VendingMachineService {
    private final VendingMachineMapper vendingMachineMapper;
    private final VmTypeMapper vmTypeMapper;
    private final RegionMapper regionMapper;
    private final NodeMapper nodeMapper;
    private final BusinessMapper businessMapper;

    //分页条件查询
    @Override
    public PageBean<VendingMachineVO> search(Integer pageIndex, Integer pageSize, String innerCode) {
        //开启分页
        PageHelper.startPage(pageIndex, pageSize);
        List<VendingMachineVO> vmList = vendingMachineMapper.vmListByInnerCode(innerCode);
        for (VendingMachineVO vendingMachineVO : vmList) {
            //查询售货机类型
            Integer vmTypeId = vendingMachineVO.getVmType();
            VmType vmType = vmTypeMapper.findById(vmTypeId);
            vendingMachineVO.setType(vmType);

            //查询区域信息
            Long regionId = vendingMachineVO.getRegionId();
            RegionVO region = regionMapper.findById(regionId);
            //查询点位数量
            region.setNodeCount(nodeMapper.countByRegionId(regionId));
            vendingMachineVO.setRegion(region);

            //查询点位信息
            Long nodeId = vendingMachineVO.getNodeId();
            NodeVO nodeVO = nodeMapper.findById(nodeId);
            nodeVO.setRegion(region);
            //查询设备数量
            Integer vmCount = vendingMachineMapper.countByNodeId(nodeId);
            nodeVO.setVmCount(vmCount);
            //查询商圈信息
            Integer businessId = nodeVO.getBusinessId();
            Business business = businessMapper.findById(businessId);
            nodeVO.setBusinessType(business);
            vendingMachineVO.setNode(nodeVO);
        }
        Page<VendingMachineVO> page = (Page<VendingMachineVO>) vmList;
        return new PageBean<>(pageIndex, pageSize, (long) page.getPages(), page.getTotal(), page.getResult());
    }
}
