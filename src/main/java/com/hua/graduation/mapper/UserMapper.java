package com.hua.graduation.mapper;

import com.hua.graduation.entity.Search.UserSearch;
import com.hua.graduation.entity.User;
import com.hua.graduation.provider.UserProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * User表Mapper类
 * @author Daniel
 */
public interface UserMapper {

    @Insert("INSERT INTO t_users_account (userId, mode, phone, email, createTime, modifyTime, password, netName)" +
            "values (#{userId}, #{mode}, #{phone}, #{email}, #{createTime}, #{modifyTime}, #{password}, #{netName})")
    public void addUser(User user);

    @Select("SELECT password FROM t_users_account WHERE isDeleted = 0 AND userId = #{userId}")
    public String getPassword(String userId);

    @SelectProvider(type= UserProvider.class, method = "query")
    public List<Map<String, Object>> query(UserSearch search);

    @SelectProvider(type= UserProvider.class, method = "getTotal")
    public Long getTotal(UserSearch search);
}
