package cn.lake.twohundreds.entity;

import lombok.*;

import java.util.Date;

/**
 * @Author: lake
 * @Date: 2022/4/2 17:42
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Article {
    //文章编号
    private Long id;
    //文章名称
    private String name;
    //文章内容
    private String content;
    //逻辑删除
    private Boolean is_delete;
    //创建时间
    private Date gmt_create;
    //修改时间
    private Date gmt_update;
    //备注
    private String remarks;
}
