package com.hua.graduation.common;

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
