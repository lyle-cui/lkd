package com.lkd.service.impl;

import com.lkd.entity.Node;
import com.lkd.mapper.NodeMapper;
import com.lkd.mapper.VendingMachineMapper;
import com.lkd.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NodeServiceImpl implements NodeService {
    @Autowired
    private NodeMapper nodeMapper;
    @Autowired
    private VendingMachineMapper vendingMachineMapper;

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
}
