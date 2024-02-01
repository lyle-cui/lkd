package com.lkd.mapper;

import com.lkd.entity.SkuClass;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface SkuClassMapper {
    //分类搜索
    List<SkuClass> search(String className);

    //新增分类
    @Insert("insert into tb_sku_class values (null,#{className},null)")
    boolean save(SkuClass skuClass);

    //修改分类
    @Update("update tb_sku_class set class_name=#{className} where class_id=#{classId}")
    boolean update(SkuClass skuClass);

    //删除分类
    @Delete("delete from tb_sku_class where class_id=#{classId}")
    boolean deleteById(Integer classId);
}
