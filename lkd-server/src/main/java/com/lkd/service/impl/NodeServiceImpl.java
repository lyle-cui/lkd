package com.lkd.service.impl;

import com.lkd.entity.Node;
import com.lkd.mapper.NodeMapper;
import com.lkd.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NodeServiceImpl implements NodeService {
    @Autowired
    private NodeMapper nodeMapper;

    //新增点位
    @Override
    public boolean save(Node node) {
        return nodeMapper.save(node);
    }
}
