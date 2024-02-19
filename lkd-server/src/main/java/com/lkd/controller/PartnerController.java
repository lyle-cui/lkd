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


}
