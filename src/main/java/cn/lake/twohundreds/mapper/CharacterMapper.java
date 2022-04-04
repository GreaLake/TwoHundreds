package cn.lake.twohundreds.mapper;

import cn.lake.twohundreds.entity.Character;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author: lake
 * @Date: 2022/4/2 13:13
 * @Description:
 */
@Mapper
public interface CharacterMapper {

    /**
     * 查询所有历史人物
     * @return
     */
    @Select("select * from tb_character ")
    public List<Character> findAllCharacter();

    /**
     * 根据id查询历史人物
     * @param id
     * @return
     */
    @Select("select * from tb_character where id=#{id}")
    public Character findCharacterById(Long id);

    /**
     * 根据姓名模糊查询历史人物
     * @return
     */
    @Select("select * from tb_character where name like #{name}")
    public List<Character> findCharacterByName();

    public List<Character> findCharacterByEvent();

    public List<Character> findCharacterByPeriod();

    /**
     * 添加历史人物
     * @param name
     * @param cover
     * @param start_time
     * @param end_time
     * @param main_event
     * @param img
     * @return
     */
    @Insert("insert tb_character(name,cover,start_time,end_time,main_event,img) values(#{name},#{cover},#{start_time},#{end_time},#{main_event},#{img})")
    public Integer addCharacter(String name,String cover,String start_time,String end_time,String main_event,String img);

    /**
     * 添加或者修改备注
     * @param remarks
     * @return
     */
    @Update("update tb_character set remarks=#{remarks}")
    public Integer addRemarks(String remarks);

}
