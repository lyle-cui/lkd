package com.lkd.controller;

import com.lkd.entity.VendingMachine;
import com.lkd.result.PageBean;
import com.lkd.result.Result;
import com.lkd.service.VendingMachineService;
import com.lkd.vo.VendingMachineVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/vm-service/vm")
public class VendingMachineController {
    @Autowired
    private VendingMachineService vendingMachineService;

    //设备搜索
    @GetMapping("/search")
    public Result search(Integer pageIndex, Integer pageSize, String innerCode) {
        PageBean<VendingMachineVO> pageBean = vendingMachineService.search(pageIndex, pageSize, innerCode);
        return Result.success(pageBean);
    }
}
