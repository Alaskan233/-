package com.example.onlineClass.mapper;

import com.example.onlineClass.model.UserData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @author 钟
 */
@Repository
@Mapper
public interface UserMapper {
    /**
     * 使用手机号码查询密码
     * @param phone 手机号码
     * @return UserData格式的返回数据
     */
    @Select("select * from user where phone = #{phone};")
    UserData checkPasswordFromPhone(@Param("phone")  String phone);
}
