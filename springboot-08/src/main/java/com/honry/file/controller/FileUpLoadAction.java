package com.honry.file.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/12 16:12
 * @Modifier: zhangkui
 * @version: V1.0
 */
@Controller
@RequestMapping("/file")
public class FileUpLoadAction {


    @RequestMapping("/toFileUploadUI")
    public String toFileUploadUI(){

        return "fileUpLoad";
    }


    @RequestMapping("/upLoadFile")
    @ResponseBody
    public Map<String,Object> upLoadFile(MultipartFile file){

        Map<String, Object> map = new HashMap<>();
        map.put("data","fasle");
        map.put("url","");
        if(file==null){
            return map;
        }

        //重新命名文件名
        String fileName=file.getOriginalFilename();
        fileName= UUID.randomUUID().toString().replace("-","")+fileName.substring(fileName.lastIndexOf("."));

        String fileUrl="D:/file/"+fileName;
        //创建父路径
        File parentFile = new File("D:/file");
        //构建一个空的目标file
        File dest=new File(fileUrl);
        if(!parentFile.exists()){
            //父路径不存在，则创建
            parentFile.mkdirs();
        }

        //构建新路径
        try {
            file.transferTo(dest);
            map.put("data","true");
            map.put("url",fileUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return map;
    }



}
