package com.lkd.controller;

import com.lkd.entity.Node;
import com.lkd.result.Result;
import com.lkd.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vm-service/node")
public class NodeController {
    @Autowired
    private NodeService nodeService;

    //新增点位
    @PostMapping
    public Result save(@RequestBody Node node){
        boolean result = nodeService.save(node);
        return Result.success(result);
    }

    //修改点位
    @PutMapping
    public Result update(@RequestBody Node node){
        boolean result = nodeService.update(node);
        return Result.success(result);
    }
}
