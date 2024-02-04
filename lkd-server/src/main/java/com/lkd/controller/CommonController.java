package com.lkd.controller;

import com.lkd.result.Result;
import com.lkd.utils.AliOssUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

//公共接口
@RestController
@RequestMapping("api/vm-service/sku")
public class CommonController {
    @Autowired
    private AliOssUtil aliOssUtil;

    //文件上传
    @PostMapping("/fileUpload")
    public Result fileUpload(MultipartFile fileName) throws IOException {
        String url = aliOssUtil.upload(fileName.getOriginalFilename(), fileName.getInputStream());
        return Result.success(url);
    }
}
