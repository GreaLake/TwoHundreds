package cn.lake.twohundreds.service;

import cn.lake.twohundreds.mapper.ImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lake
 * @Date: 2022/4/3 11:55
 * @Description:
 */
@Service
public class ImageService {

    @Autowired
    ImageMapper imageMapper;

    public Boolean saveImage(String name,String path){
        return imageMapper.saveImage(name,path)!=0;
    }


}
