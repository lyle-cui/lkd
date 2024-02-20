package com.lkd.controller;

import com.lkd.entity.Region;
import com.lkd.result.PageBean;
import com.lkd.result.Result;
import com.lkd.service.RegionService;
import com.lkd.vo.RegionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vm-service/region")
public class RegionController {
    @Autowired
    private RegionService regionService;

    //区域搜索
    @GetMapping("/search")
    public Result search(Integer pageIndex, Integer pageSize, String name) {
        PageBean<RegionVO> pageBean = regionService.search(pageIndex, pageSize, name);
        return Result.success(pageBean);
    }

    //区域保存
    @PostMapping
    public Result save(@RequestBody Region region){
        boolean result = regionService.save(region);
        return Result.success(result);
    }

    //区域修改
    @PutMapping
    public Result update(@RequestBody Region region){
        boolean result = regionService.update(region);
        return Result.success(result);
    }
}
