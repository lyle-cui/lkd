package com.lkd.mapper;

import com.lkd.entity.Partner;
import com.lkd.vo.PartnerVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PartnerMapper {
    //条件模糊查询
    List<Partner> search(String name);

    //新增合作商
    @Insert("insert into tb_partner values (null,#{name},#{password},#{account},#{mobile},#{phone},#{email}," +
            "#{province},#{city},#{county},#{addr},#{contact},#{ratio},#{status},now(),now())")
    boolean save(Partner partner);

    //根据id查询合作商
    @Select("select * from tb_partner where id = #{id}")
    Partner getById(Integer id);

    //更新合作商
    boolean update(Partner partner);
}
