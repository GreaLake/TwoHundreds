package cn.lake.twohundreds.entity;

import lombok.*;

import java.util.Date;

/**
 * @Author: lake
 * @Date: 2022/4/2 17:47
 * @Description:
 */
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Image {
    //图片编号
    private Long id;
    //图片名称
    private String name;
    //图片路径
    private String path;
    //逻辑删除
    private Boolean is_delete;
    //创建时间
    private Date gmt_create;
    //修改时间
    private Date gmt_update;
    //备注
    private String remarks;
}
