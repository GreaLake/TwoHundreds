package cn.lake.twohundreds.mapper;


import cn.lake.twohundreds.entity.Period;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: lake
 * @Date: 2022/4/3 17:48
 * @Description:
 */
@Mapper
public interface PeriodMapper {

    /**
     * 添加不同的历史时期
     * @param name
     * @param start_time
     * @param end_time
     * @param introduction
     * @return
     */
    @Insert("insert tb_period(name,start_time,end_time,introduction)values(#{name},#{start_time},#{end_time},#{introduction})")
    public Integer save(String name,String start_time,String end_time,String introduction);

    /**
     * 查询所有历史时期
     * @return
     */
    @Select("select * from tb_period")
    public List<Period> findAllPeriod();

    /**
     * 根据id查询历史时期
     * @return
     */
    @Select("select * from tb_period where id=#{id}")
    public Period findPeriodById(String id);

}
