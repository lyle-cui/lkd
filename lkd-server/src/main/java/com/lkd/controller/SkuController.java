package com.lkd.controller;

import com.lkd.entity.Sku;
import com.lkd.result.PageBean;
import com.lkd.result.Result;
import com.lkd.service.SkuService;
import com.lkd.vo.SkuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//商品管理
@RestController
@RequestMapping("/api/vm-service/sku")
public class SkuController {
    @Autowired
    private SkuService skuService;

    //分页查询
    @GetMapping("/search")
    public Result search(Integer pageIndex, Integer pageSize, String skuName) {
        PageBean<SkuVO> pageBean = skuService.search(pageIndex, pageSize, skuName);
        return Result.success(pageBean);
    }
    //新增商品
    @PostMapping
    public Boolean save(@RequestBody Sku sku) {
        return skuService.save(sku);
    }
    //修改商品
    @PutMapping
    public Boolean update(@RequestBody Sku sku) {
        return skuService.update(sku);
    }
}
