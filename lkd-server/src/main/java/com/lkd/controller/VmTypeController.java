package com.lkd.controller;

import com.lkd.entity.VmType;
import com.lkd.result.PageBean;
import com.lkd.result.Result;
import com.lkd.service.VmTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vm-service/vmType")
public class VmTypeController {
    @Autowired
    private VmTypeService vmTypeService;

    //设备类型搜索
    @GetMapping("/search")
    public Result search(String name, Integer pageIndex, Integer pageSize) {
        PageBean<VmType> vmTypeList = vmTypeService.search(name, pageIndex, pageSize);
        return Result.success(vmTypeList);
    }

    //新增设备类型
    @PostMapping
    public Result save(@RequestBody VmType vmType) {
        boolean result =vmTypeService.save(vmType);
        return Result.success(result);
    }
}
