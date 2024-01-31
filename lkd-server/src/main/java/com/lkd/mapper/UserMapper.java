package com.lkd.mapper;


import com.lkd.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper{
    //用户登录
    @Select("select * from tb_user where login_name=#{loginName}")
    User findByLoginName(String loginName);

}
