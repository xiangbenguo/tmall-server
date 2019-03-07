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
    public static final CodeMessage USER_ALREADY_EXISTS_ERROR = new CodeMessage(3,"用户已存在");
    public static final CodeMessage USERNAME_ERROR = new CodeMessage(4,"用户名错误");
    public static final CodeMessage USERPASSWORD_ERROR = new CodeMessage(5,"用户密码错误");
}
