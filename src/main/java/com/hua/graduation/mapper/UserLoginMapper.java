package com.hua.graduation.mapper;


import com.hua.graduation.entity.User;
import com.hua.graduation.entity.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 用户登录mapper
 * @author Daniel
 */
public interface UserLoginMapper {
    /**
     * 插入一个新的用户
     * @param user 新增的用户
     */
    @Insert("INSERT INTO t_users_account (userId, mode, phone, email, createTime, modifyTime, password, netName)" +
            "values (#{userId}, #{mode}, #{phone}, #{email}, #{createTime}, #{modifyTime}, #{password}, #{netName})")
    public void addUser(User user);

    /**
     *获取特定用户的密码;
     * @param userId 用户账号
     * @return
     */
    @Select("SELECT password FROM t_users_account WHERE isDeleted = 0 AND userId = #{userId}")
    public String getPassword(String userId);

    /**
     * 更新用户信息;
     * @param user
     */
    @Update("UPDATE t_users_account SET password = #{password} WHERE userId = #{userId}")
    public void updatePassword(User user);

    /**
     * 新增用户的完善信息;
     * @param userInfo
     */
    @Insert("INSERT INTO t_users_info (usersId, age, sex, address, createTime, modifyTime) VALUES(#{userId}, #{age}, #{sex}," +
            " #{address}, #{createTime}, #{modifyTime})")
    public void insertUserInfo(UserInfo userInfo);
}
