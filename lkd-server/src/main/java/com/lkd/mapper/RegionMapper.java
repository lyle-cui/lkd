package com.lkd.mapper;

import com.lkd.vo.RegionVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RegionMapper {
    // 条件查询
    List<RegionVO> search(String name);
}
