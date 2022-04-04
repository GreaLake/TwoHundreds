package cn.lake.twohundreds.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: lake
 * @Date: 2022/4/3 11:52
 * @Description:
 */
@Mapper
public interface ImageMapper {

    /**
     * ÃÌº”“ª’≈Õº∆¨
     * @param name
     * @param path
     * @return
     */
    @Insert("insert into tb_image(name,path) values(#{name},#{path})")
    public Integer saveImage(String name ,String path);


}
