package com.tmall.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by yangxiong on 2019/3/11.
 */
@Configuration
public class AdapterConfig implements WebMvcConfigurer {

    @Bean
    LoginInterceptor loginInterceptor() {
        return new LoginInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration addInterceptor = registry.addInterceptor(loginInterceptor());

        //排除配置
        addInterceptor.excludePathPatterns("/login/**");
        addInterceptor.excludePathPatterns("/upload/**");

        //拦截配置
        addInterceptor.addPathPatterns("/**/**");
    }
}
