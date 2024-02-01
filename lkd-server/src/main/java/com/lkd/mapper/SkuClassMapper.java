package com.lkd.mapper;

import com.lkd.entity.SkuClass;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SkuClassMapper {
    //分类搜索
    List<SkuClass> search(String className);
}
