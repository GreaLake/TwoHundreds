package cn.lake.twohundreds.service;

import cn.lake.twohundreds.mapper.PeriodMapper;
import cn.lake.twohundreds.model.Period;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lake
 * @Date: 2022/4/3 18:04
 * @Description:
 */
@Service
public class PeriodService {

    @Autowired
    PeriodMapper periodMapper;

    /**
     * 添加历史时期
     * @param name
     * @param start_time
     * @param end_time
     * @param introduction
     * @return
     */
    public Boolean savePeriod(String name,String start_time,String end_time,String introduction){
        return periodMapper.save(name,start_time,end_time,introduction)!=0;
    }

    //这里使用模型层

    /**
     * 查询所有历史时期封装成model提供给前端
     * @return
     */
    public List<Period> findAll(){

        List<Period> periods = new ArrayList<>();
        List<cn.lake.twohundreds.entity.Period> allPeriod = periodMapper.findAllPeriod();
        for (cn.lake.twohundreds.entity.Period period:allPeriod) {
            periods.add(new Period(period.getId(),period.getName()+"("+
                    period.getStart_time()+"-"+
                    period.getEnd_time()+")",
                    period.getIntroduction()));
        }
        return periods;
    }
}
