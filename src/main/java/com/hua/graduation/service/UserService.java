package com.hua.graduation.service;


import com.hua.graduation.common.Page;
import com.hua.graduation.entity.Search.UserSearch;
import com.hua.graduation.entity.User;
import com.hua.graduation.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * User业务类
 * @author Daniel
 */

@Service("UserService")
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void addUser (User user) {
        user.setCreateTime(new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(new Date()));
        user.setModifyTime(new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(new Date()));
        userMapper.addUser(user);
    }

    public boolean isPassword(User user) {
        String password = userMapper.getPassword(user.getPassword());
        if(password != null && password.equals(user.getPassword())) {
            return true;
        } else {
            return false;
        }
    }

    public Page<Map<String, Object>> query(UserSearch search) {
        return new Page<Map<String, Object>>(search.getSize(),search.getPage(),userMapper.getTotal(search), userMapper.query(search));
    }
}
