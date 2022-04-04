package cn.lake.twohundreds.controller;

import cn.lake.twohundreds.Untils.Result;
import cn.lake.twohundreds.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: lake
 * @Date: 2022/4/3 12:00
 * @Description:
 */
@RestController
public class ImageController {

    @Autowired
    ImageService imageService;

    @PostMapping("/image/saveImage")
    public Result saveImage(@RequestParam String name,
                                @RequestParam String path){
        Boolean flag = imageService.saveImage(name,path);
        return new Result(200,flag,"/saveImage");
    }

}
