package com.hua.graduation.controller;

import com.hua.graduation.common.ResultBean;
import com.zhenzi.sms.ZhenziSmsClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 验证用户(方式：手机、邮箱)
 * @Date 2019-04-10
 * @author Daniel
 */
@RestController
@RequestMapping(value = "/login/verify")
public class VerifyController extends BaseController {
    @RequestMapping(value = "/phone")
    public ResultBean checkPhone(HttpServletRequest request, HttpServletResponse response) {
        String appId = "101237";
        String appSecret = "f2377c4b-982b-4089-b232-c37fce98fc1b";
        ZhenziSmsClient client = new ZhenziSmsClient("https://sms_developer.zhenzikj.com", appId, appSecret);
        try {
            return returnSuccess(client.send("13316759743", "这是一条测试信息，验证码为:667832"));
        } catch (Exception e) {
            e.printStackTrace();
            return returnFailure();
        }
    }
}

