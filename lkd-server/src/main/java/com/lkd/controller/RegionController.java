package com.lkd.controller;

import com.lkd.entity.Region;
import com.lkd.result.PageBean;
import com.lkd.result.Result;
import com.lkd.service.RegionService;
import com.lkd.vo.NodeVO;
import com.lkd.vo.RegionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vm-service")
public class RegionController {
    @Autowired
    private RegionService regionService;

    //区域搜索
    @GetMapping("/region/search")
    public Result search(Integer pageIndex, Integer pageSize, String name) {
        PageBean<RegionVO> pageBean = regionService.search(pageIndex, pageSize, name);
        return Result.success(pageBean);
    }

    //区域保存
    @PostMapping("/region")
    public Result save(@RequestBody Region region) {
        boolean result = regionService.save(region);
        return Result.success(result);
    }

    //区域修改
    @PutMapping("/region")
    public Result update(@RequestBody Region region) {
        boolean result = regionService.update(region);
        return Result.success(result);
    }

    //根据区域id查询该区域下的点位列表
    @GetMapping("/node/search")
    public Result searchNode(Integer regionId, Integer pageIndex, Integer pageSize) {
        PageBean<NodeVO> pageBean = regionService.searchNode(regionId, pageIndex, pageSize);
        return Result.success(pageBean);
    }
}
