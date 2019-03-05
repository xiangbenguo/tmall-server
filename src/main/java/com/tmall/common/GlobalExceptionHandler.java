package com.tmall.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangxiong on 2019/3/5.
 */
public class GlobalExceptionHandler {

    @ExceptionHandler({Exception.class})
    @ResponseBody
    protected Object ExceptionHandler(Exception ex) {
        Map map = new HashMap();
        if (ex instanceof MyException) {
            MyException me = (MyException) ex;
            map.put("code", me.getCode());
            map.put("msg", me.getMsg());
            map.put("data", null);
        } else {
            map.put("code", CodeMessageDef.SYSTEM_ERROR.getCode());
            map.put("msg", CodeMessageDef.SYSTEM_ERROR.getMsg());
            map.put("data", null);
        }

        return map;
    }
}
