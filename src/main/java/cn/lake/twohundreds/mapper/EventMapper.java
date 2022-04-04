package cn.lake.twohundreds.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: lake
 * @Date: 2022/4/4 11:49
 * @Description:
 */
@Mapper
public interface EventMapper {

    @Insert("insert tb_event(start_time,end_time,cover,main_character,cause," +
            "after,result,influence,text,img,period)values" +
            "(#{start_time},#{end_time},#{cover},#{main_character},#{cause}," +
            "#{after},#{result},#{influence},#{text},#{img},#{period})")
    public Integer addEvent();


}
