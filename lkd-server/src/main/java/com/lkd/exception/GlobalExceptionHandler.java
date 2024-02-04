package com.lkd.exception;

import cn.hutool.core.util.StrUtil;
import com.lkd.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//全局异常处理类
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    //预期异常（业务异常） BusinessException
    @ExceptionHandler(BusinessException.class)
    public Result handlerBusinessException(BusinessException e) {
        log.error("出现业务异常：{}", e);
        return Result.error(e.getCode(), e.getMessage());
    }

    //重复键异常
    @ExceptionHandler(DuplicateKeyException.class)
    public Result handlerDuplicateKeyException(DuplicateKeyException e) {
        log.error("出现重复键异常：{}", e);
        if (StrUtil.contains(e.getMessage(), "sku_name")) {
            return Result.error("该商品已存在，请勿重复添加");
        }
        return Result.error("字段重复");
    }

    //非预期异常 Exception 兜底异常处理
    @ExceptionHandler(Exception.class)
    public Result handlerException(Exception e) {
        log.error("出现未知异常：{}", e);
        return Result.error(500, "未知异常，请稍后重试");
    }
}
