package cn.lake.twohundreds.entity;

import lombok.*;

import java.util.Date;

/**
 * @Author: lake
 * @Date: 2022/4/2 17:24
 * @Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Admin {
    //管理员编号
    private Long id;
    //管理员姓名
    private String name;
    //管理员密码
    private String password;
    //管理员权限
    private String role;
    //逻辑删除
    private Boolean is_delete;
    //创建时间
    private Date gmt_create;
    //修改时间
    private Date gmt_update;
}
