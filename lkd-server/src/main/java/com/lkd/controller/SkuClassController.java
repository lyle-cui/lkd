package com.lkd.controller;

import com.lkd.entity.SkuClass;
import com.lkd.result.PageBean;
import com.lkd.result.Result;
import com.lkd.service.SkuClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vm-service/skuClass")
public class SkuClassController {
    @Autowired
    private SkuClassService skuClassService;

    //分类搜索
    @GetMapping("/search")
    public Result search(Integer pageIndex, Integer pageSize, String className) {
        PageBean<SkuClass> pageBean = skuClassService.search(pageIndex, pageSize, className);
        return Result.success(pageBean);
    }

    //新增分类
    @PostMapping
    public Result save(@RequestBody SkuClass skuClass) {
        boolean flag = skuClassService.save(skuClass);
        return Result.success(flag);
    }
}
