package com.tmall.common;

import com.tmall.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xiangbenguo on 2019/3/11.
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        User user = (User) request.getSession().getAttribute(GlobalHandler.SESSION_USER);
//        if (user == null || user.getId() == 0) {
//            throw new MyException(CodeMessageDef.USER_NOT_LOGGED_IN);
//        }
        return true;
    }
}
