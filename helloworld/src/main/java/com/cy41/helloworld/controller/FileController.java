package com.cy41.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class FileController {

    /**
     * 打开文件上传请求页面
     *
     * @return 指向JSP的字符串
     */
    @GetMapping("/upload/page")
    public String uploadPage() {
        return "file/upload";
    }

    @PostMapping("/upload/multipart")
    @ResponseBody
    // 使用Spring MVC的MultipartFile类作为参数，对应了保存的临时文件
    public Map<String, Object> upload(@RequestParam("photo") MultipartFile[] photos){

        String path = "D:/TIMQQ_down/MobileFile/";//保存路径
        for(MultipartFile photo:photos){
            if(photo.getSize()==0){ continue; }
            String filename = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());

            //获取上传文件的后缀suffix
            String suffix = photo.getOriginalFilename().substring(photo.getOriginalFilename().lastIndexOf("."));
            if (!suffix.equals(".jpg")) {
                return dealResultMap(false, "上传失败");
            }
            try {
                //Spring提供了文件操作类FileCopyUtils
                FileCopyUtils.copy(photo.getInputStream(), new FileOutputStream(path + filename + suffix));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return dealResultMap(false, "上传失败");

            }

        }
        return dealResultMap(true, "上传成功");
    }

    // 处理上传文件结果
    private Map<String, Object> dealResultMap(boolean success, String msg) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("success", success);
        result.put("msg", msg);
        return result;
    }
}

