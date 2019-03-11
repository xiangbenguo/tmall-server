package com.tmall.controller;

import com.tmall.common.CodeMessageDef;
import com.tmall.common.MyException;
import com.tmall.common.ResultBean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;

/**
 * Created by yangxiong on 2019/3/7.
 */
@RestController
@RequestMapping(value = "/product")
public class UploadController {

    @PostMapping("/upload")
    public Object upload(@RequestParam("file") MultipartFile file) throws IOException, MyException {
        if (file.isEmpty()) {
            throw new MyException(CodeMessageDef.PARAMETER_ERROR);
        }

        String fileName = file.getOriginalFilename();
        String filePath = "/Users/itinypocket/workspace/temp/";
        File dest = new File(filePath + fileName);
        file.transferTo(dest);
        return new ResultBean();
    }
}
