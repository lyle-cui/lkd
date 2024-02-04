package com.lkd.mapper;

import com.lkd.entity.Sku;
import com.lkd.vo.SkuVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//商品管理
@Mapper
public interface SkuMapper {
    //分页查询
    List<SkuVO> search(String skuName);
}
