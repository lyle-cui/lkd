package com.lkd.controller;

import com.lkd.entity.Partner;
import com.lkd.result.PageBean;
import com.lkd.result.Result;
import com.lkd.service.PartnerService;
import com.lkd.vo.PartnerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user-service/partner")
public class PartnerController {
    @Autowired
    private PartnerService partnerService;

    //分页条件查询
    @GetMapping("/search")
    public Result search(@RequestParam(defaultValue = "1") Integer pageIndex,
                         @RequestParam(defaultValue = "10") Integer pageSize,
                         String name) {
        PageBean<PartnerVO> pageBean = partnerService.search(pageIndex, pageSize, name);
        return Result.success(pageBean);
    }

    //新增合作商
    @PostMapping
    public Result save(@RequestBody Partner partner){
        boolean result =partnerService.save(partner);
        return Result.success(result);
    }

    //根据id查询合作商详情
    @GetMapping("/{id}")
    public Result findById(@PathVariable Integer id){
        PartnerVO partnerVO = partnerService.findById(id);
        return Result.success(partnerVO);
    }

    //修改合作商信息
    @PutMapping
    public Result update(@RequestBody Partner partner){
        boolean result = partnerService.update(partner);
        return Result.success(result);
    }

    //删除合作商
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        boolean result = partnerService.delete(id);
        return Result.success(result);
    }

    //合作商数量统计
    @GetMapping("/count")
    public Result count(){
        Integer count = partnerService.count();
        return Result.success(count);
    }

}
