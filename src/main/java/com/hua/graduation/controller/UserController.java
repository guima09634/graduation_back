package com.hua.graduation.controller;

import com.hua.graduation.common.ResultBean;
import com.hua.graduation.entity.Search.UserSearch;
import com.hua.graduation.entity.User;
import com.hua.graduation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户功能拦截器
 * @author Daniel
 */
@RestController
@RequestMapping(value = "/api/user")
public class UserController extends BaseController{

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/registered")
    public ResultBean registered(@RequestBody User user) {
        try {
            userService.addUser(user);
            return returnSuccess("注册成功");
        } catch (Exception e) {
            e.printStackTrace();
            return returnFailure("注册失败");
        }
    }

    @RequestMapping(value = "/login")
    public ResultBean login(@RequestBody  User user) {
        if(userService.isPassword(user)) {
            return returnSuccess("登陆成功");
        } else {
            return returnFailure("用户名或密码错误");
        }
    }

    @RequestMapping(value = "/query")
    public ResultBean query(@RequestBody UserSearch search) {
        try{
            return returnSuccess(userService.query(search));
        } catch (Exception e) {
            e.printStackTrace();
            return returnFailure("查找失败，请联系接口负责人。");
        }
    }
}
