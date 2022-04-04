package cn.lake.twohundreds.entity;

import lombok.*;

import java.util.Date;

/**
 * @Author: lake
 * @Date: 2022/4/2 17:29
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Period {
    //历史时期编号
    private Long id;
    //历史时期名称
    private String name;
    //开始时间
    private String start_time;
    //结束时间
    private String end_time;
    //简介
    private String introduction;
    //逻辑删除
    private Boolean is_delete;
    //创建时间
    private Date gmt_create;
    //修改时间
    private Date gmt_update;
    //备注
    private String remarks;
}
