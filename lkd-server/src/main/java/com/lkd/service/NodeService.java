package com.lkd.service;

import com.lkd.entity.Node;
import com.lkd.vo.VendingMachineVO;

import java.util.List;

public interface NodeService {
    //新增点位
    boolean save(Node node);

    //修改点位
    boolean update(Node node);

    //删除点位
    boolean delete(Long nodeId);

    //根据点位id查询点位下的虚拟机
    List<VendingMachineVO> vmListByNodeId(Long nodeId);

    //点位数量统计
    Integer nodeCount();
}
