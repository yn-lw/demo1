package com.hbsi.demo1.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author JLW
 * @create 2021-05-21 16:20
 */
@Data // get set
@AllArgsConstructor // 有参
@NoArgsConstructor // 无参
public class Car {

    private Integer id;
    private String name;
    private Float price;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:SS",timezone = "GMT+8")
    private Date createdate;


}
