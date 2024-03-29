package cn.lake.twohundreds.Untils;

import lombok.*;

/**
 * @Author: lake
 * @Date: 2022/4/2 9:43
 * @Description:
 */
@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    // 返回码
    private Integer code;
    // 数据
    private Object data;
    // uri路径
    private String path;
}
