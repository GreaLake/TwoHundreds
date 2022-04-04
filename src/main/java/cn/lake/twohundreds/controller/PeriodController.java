package cn.lake.twohundreds.controller;

import cn.lake.twohundreds.Untils.Result;
import cn.lake.twohundreds.model.Period;
import cn.lake.twohundreds.service.PeriodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: lake
 * @Date: 2022/4/3 18:09
 * @Description:
 */
@RestController
@RequestMapping("/period")
public class PeriodController {

    @Autowired
    PeriodService periodService;

    @PostMapping("/savePeriod")
    public Result save(@RequestParam String name,
                       @RequestParam String start_time,
                       @RequestParam String end_time,
                       @RequestParam String introduction){
        return new Result(200,periodService.savePeriod(name,start_time,end_time,introduction) ,"/period/savePeriod");
    }

    @GetMapping("/findAllPeriod")
    public List<Period> findAll(){
        return periodService.findAll();
    }
}
