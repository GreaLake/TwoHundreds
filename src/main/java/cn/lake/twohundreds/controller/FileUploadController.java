package cn.lake.twohundreds.controller;

import cn.lake.twohundreds.service.ImageService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;




import javax.servlet.http.HttpServletRequest;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;


/**
 * @Author: lake
 * @Date: 2022/4/3 11:39
 * @Description:
 */
@RestController
@RequestMapping("file")
@Slf4j
public class FileUploadController {

    @Autowired
    ImageService imageService;

    @Value("${file.upload.dir}")
    private String uploadFilePath;

    @GetMapping(value = {"","/","/index"})
    public String index(){return "/upload";}

    @ResponseBody
    @PostMapping("/uploadFile")
    public String fileUpload(@RequestParam("file")MultipartFile file ) throws JSONException {
        JSONObject result = new JSONObject();
        if (file.isEmpty()){
            result.put("error","空文件");
            return result.toString();
        }
        //文件名
        String fileName = file.getOriginalFilename();
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        log.info("上传文件名称为:{},后缀名为{}!",fileName,suffixName);

        File fileTempObj = new File(uploadFilePath + "/" + fileName);
        //检测目录是否存在
        if (!fileTempObj.getParentFile().exists()){
            fileTempObj.getParentFile().mkdirs();
            System.out.println(fileTempObj);
        }
        //使用文件夹名称检测文件是否存在
        if (fileTempObj.exists()){
            result.put("error","文件已经存在");
            return result.toString();
        }
        try {
            file.transferTo(fileTempObj);
        } catch (IOException e) {
            log.error("发生错误:{}","文件上传成功！");
            result.put("error",e.getMessage());
            return result.toString();
        }

        result.put("success",fileTempObj.toString());
        imageService.saveImage(fileName,fileTempObj.toString());
        return result.toString();
    }

    @PostMapping("/uploadImage")
    public void save1(@RequestParam("name") String name,HttpServletRequest request) throws IOException {
        // request.getParameter() 获取name,取不到值 null
        System.out.println("name is :" + name); // null
        System.out.println("----------------请求正文----------------");
        InputStream in = request.getInputStream();// 字节流
        byte[] bs = new byte[1024]; //1kB 字节数组缓存区
        int len = 0;
        while ((len = in.read(bs))!=-1){
            String str = new String(bs,0,len);
            System.err.println(str);
        }
    }


}
