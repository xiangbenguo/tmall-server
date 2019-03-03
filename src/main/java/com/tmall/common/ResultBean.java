package com.tmall.common;

/**
 * Created by yangxiong on 2019/3/2.
 */
public class ResultBean {
    private int code;
    private String message;
    private Object data;

    public ResultBean() {
        this.code = 200;
        this.message = "操作成功";
    }

    public ResultBean(Object data) {
        this.code = 200;
        this.message = "操作成功";
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
