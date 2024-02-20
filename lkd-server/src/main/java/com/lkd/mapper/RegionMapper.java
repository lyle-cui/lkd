package com.lkd.mapper;

import com.lkd.entity.Region;
import com.lkd.vo.RegionVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RegionMapper {
    // 条件查询
    List<RegionVO> search(String name);

    //区域保存
    @Insert("insert into tb_region values (null,#{name},#{remark})")
    boolean save(Region region);
}
