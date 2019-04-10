package com.hua.graduation.common;

/**
 * json格式
 * @Date 2019-04-10
 * @author Daniel
 * @param <T> 数据类型
 */
public class ResultBean<T> {
    protected String code;

    protected String message;

    protected T data;

    public ResultBean() {

    }

    public ResultBean(String code, String message) {
        this(code, message, null);
    }

    public ResultBean(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
