package com.hua.graduation.controller;

import com.hua.graduation.common.ResultBean;
import com.hua.graduation.common.ResultCode;

public class BaseController {
    /**
     * 返回成功结果
     *
     * @return
     */
    protected ResultBean<?> returnSuccess() {
        return returnSuccess(null);
    }

    /**
     * 返回成功结果
     *
     * @param data
     * @param <T>
     * @return
     */
    protected <T> ResultBean<T> returnSuccess(T data) {
        return returnResult(ResultCode.SUCCESS, data, "success");
    }

    /**
     * 返回失败结果
     *
     * @return
     */
    protected ResultBean<?> returnFailure() {
        return returnFailure("failure");
    }

    /**
     * 返回失败结果
     *
     * @param e
     * @return
     */
    protected ResultBean<?> returnFailure(Throwable e) {
        return returnFailure(e.getMessage());
    }

    /**
     * 返回失败结果
     *
     * @param message
     * @return
     */
    protected ResultBean<?> returnFailure(String message) {
        return returnResult(ResultCode.FAILURE, message);
    }

    protected ResultBean<?> returnResult(String code, String message) {
        return returnResult(code, null, message);
    }

    protected <T> ResultBean<T> returnResult(String code, T data, String message) {
        ResultBean<T> resultBean = new ResultBean<T>(code, message, data);
        return resultBean;
    }
}
