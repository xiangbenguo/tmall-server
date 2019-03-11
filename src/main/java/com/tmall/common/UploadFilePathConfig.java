package com.tmall.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by yangxiong on 2019/3/11.
 */
@Configuration
public class UploadFilePathConfig implements WebMvcConfigurer {

    @Value("${file.upload.folder}")
    private String uploadFolder;

    @Value("${file.upload.maxSize}")
    private int uploadMaxSize;

    public String getUploadFolder() {
        return uploadFolder;
    }

    public int getUploadMaxSize() {
        return uploadMaxSize;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler( "/upload/**").addResourceLocations("file:" + uploadFolder);
    }
}
