package com.lkd.controller;

import com.lkd.entity.Sku;
import com.lkd.result.PageBean;
import com.lkd.result.Result;
import com.lkd.service.SkuService;
import com.lkd.vo.SkuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
