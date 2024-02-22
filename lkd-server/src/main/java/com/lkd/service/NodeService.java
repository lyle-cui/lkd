package com.lkd.service;

import com.lkd.entity.Node;

public interface NodeService {
    //新增点位
    boolean save(Node node);

    //修改点位
    boolean update(Node node);
}
