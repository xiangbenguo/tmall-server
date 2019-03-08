package com.tmall.common;

/**
 * Created by yangxiong on 2019/3/5.
 */
public class CodeMessageDef {

    /**
     * 公共错误 1-100
     */
    public static final CodeMessage SYSTEM_ERROR = new CodeMessage(1, "未知系统错误！");
    public static final CodeMessage PARAMETER_ERROR = new CodeMessage(2, "参数错误");
    public static final CodeMessage USER_NOT_LOGGED_IN = new CodeMessage(3, "用户未登录");

    /**
     * 用户相关错误 101-200
     */
    public static final CodeMessage USER_ALREADY_EXISTS_ERROR = new CodeMessage(101,"用户已存在");
    public static final CodeMessage USER_NAME_ERROR = new CodeMessage(102,"用户名错误");
    public static final CodeMessage USER_PASSWORD_ERROR = new CodeMessage(103,"用户密码错误");
}
