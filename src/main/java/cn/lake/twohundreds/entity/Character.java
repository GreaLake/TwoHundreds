package cn.lake.twohundreds.entity;

import lombok.*;

import java.util.Date;

/**
 * @Author: lake
 * @Date: 2022/4/2 13:07
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Character {
    //历史人物编号
    private Long id;
    //历史人物姓名
    private String name;
    //封面
    private String cover;
    //出生时间
    private String start_time;
    //死亡时间
    private String end_time;
    //主要参与事件
    private String main_event;
    //人物照片
    private String img;
    //逻辑删除
    private Boolean is_delete;
    //创建时间
    private Date gmt_create;
    //修改时间
    private Date gmt_update;
    //备注
    private String remarks;
}
