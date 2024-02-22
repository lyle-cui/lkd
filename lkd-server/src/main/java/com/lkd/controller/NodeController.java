package com.lkd.controller;

import com.lkd.entity.Node;
import com.lkd.result.Result;
import com.lkd.service.NodeService;
import com.lkd.vo.VendingMachineVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vm-service/node")
public class NodeController {
    @Autowired
    private NodeService nodeService;

    //新增点位
    @PostMapping
    public Result save(@RequestBody Node node) {
        boolean result = nodeService.save(node);
        return Result.success(result);
    }

    //修改点位
    @PutMapping
    public Result update(@RequestBody Node node) {
        boolean result = nodeService.update(node);
        return Result.success(result);
    }

    //删除点位
    @DeleteMapping("/{nodeId}")
    public Result delete(@PathVariable("nodeId") Long nodeId) {
        boolean result = nodeService.delete(nodeId);
        return Result.success(result);
    }

    //根据点位id查询设备列表
    @GetMapping("/vmList/{nodeId}")
    public Result vmListByNodeId(@PathVariable("nodeId") Long nodeId) {
        List<VendingMachineVO> vmList = nodeService.vmListByNodeId(nodeId);
        return Result.success(vmList);
    }
}
