package com.hua.graduation.controller;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.httpclient.HTTPException;
import com.hua.graduation.common.ResultBean;
import com.zhenzi.sms.ZhenziSmsClient;
import org.apache.http.HttpException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.net.www.http.HttpClient;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
        int appId = 1400201329;
        String appSecret = "df10cfcc6a9b75e28b40c5c73b54a44c";
        SmsSingleSender singleSender = new SmsSingleSender(appId, appSecret);
        try{
             return  returnSuccess(singleSender.send(1, null, "13316759743", "这是个测试内容", null, null));
        } catch (HTTPException e) {
            e.printStackTrace();
            return returnFailure();
        } catch (IOException e) {
            e.printStackTrace();
            return returnFailure();
        }
    }
}

