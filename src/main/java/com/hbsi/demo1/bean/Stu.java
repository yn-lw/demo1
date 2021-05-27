package com.hbsi.demo1.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author JLW
 * @create 2021-05-21 21:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stu {
    private Long id;
    private String name;
    private Integer age;
}
