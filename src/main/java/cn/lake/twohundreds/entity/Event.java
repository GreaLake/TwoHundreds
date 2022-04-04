package cn.lake.twohundreds.entity;

import lombok.*;

import java.util.Date;

/**
 * @Author: lake
 * @Date: 2022/4/2 17:34
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Event {
    //历史事件编号
    private Long id;
    //历史事件名称
    private String name;
    //发生时间
    private String start_time;
    //结束时间
    private String end_time;
    //封面
    private String cover;
    //主要人物
    private String main_character;
    //起因(导火索)
    private String cause;
    //经过
    private String after;
    //结果
    private String result;
    //影响
    private String influence;
    //正文
    private String text;
    //事件照片
    private String img;
    //所属历史时期
    private Integer period;
    //逻辑删除
    private Boolean is_delete;
    //创建时间
    private Date gmt_create;
    //修改时间
    private Date gmt_update;
    //备注
    private String remarks;
}
