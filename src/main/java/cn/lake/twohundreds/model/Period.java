package cn.lake.twohundreds.model;

import lombok.*;

/**
 * @Author: lake
 * @Date: 2022/4/4 10:56
 * @Description:
 */
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Period {

    private Long id;
    private String tile;

    private String introduction;
}
