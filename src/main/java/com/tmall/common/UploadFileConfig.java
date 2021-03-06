package com.tmall.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xiangbenguo on 2019/3/11.
 */
@Configuration
public class UploadFileConfig {

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
}
