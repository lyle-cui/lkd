package com.lkd.mapper;


import com.lkd.entity.User;
import com.lkd.vo.UserVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper{
    //用户登录
    @Select("select * from tb_user where login_name=#{loginName}")
    User findByLoginName(String loginName);

    //用户列表
    List<UserVO> search(String userName);

    //新增用户
    @Insert("insert into tb_user values (null,#{roleId}, #{userName}, #{loginName}, #{password}, #{secret}, #{roleCode}, #{mobile}, #{regionId}, #{regionName}, #{status}, #{image})")
    boolean save(User user);
}
