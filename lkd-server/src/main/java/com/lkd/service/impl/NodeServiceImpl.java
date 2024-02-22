package com.lkd.service.impl;

import com.github.pagehelper.Page;
import com.lkd.entity.Business;
import com.lkd.entity.Node;
import com.lkd.entity.VmType;
import com.lkd.mapper.*;
import com.lkd.service.NodeService;
import com.lkd.service.RegionService;
import com.lkd.vo.NodeVO;
import com.lkd.vo.RegionVO;
import com.lkd.vo.VendingMachineVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NodeServiceImpl implements NodeService {
    @Autowired
    private NodeMapper nodeMapper;
    @Autowired
    private VendingMachineMapper vendingMachineMapper;
    @Autowired
    private VmTypeMapper vmTypeMapper;
    @Autowired
    private RegionMapper regionMapper;
    @Autowired
    private BusinessMapper businessMapper;

    //新增点位
    @Override
    public boolean save(Node node) {
        return nodeMapper.save(node);
    }

    //修改点位
    @Override
    public boolean update(Node node) {
        return nodeMapper.update(node);
    }

    //删除点位
    @Override
    @Transactional
    public boolean delete(Long nodeId) {
        boolean result = nodeMapper.delete(nodeId);
        //删除对应点位的售货机
        boolean result2 = vendingMachineMapper.deleteByNodeId(nodeId);
        return result && result2;
    }

    //根据nodeId查询点位下的售货机
    @Override
    public List<VendingMachineVO> vmListByNodeId(Long nodeId) {
        List<VendingMachineVO> vmList = vendingMachineMapper.vmListByNodeId(nodeId);
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
        return vmList;
    }
}
