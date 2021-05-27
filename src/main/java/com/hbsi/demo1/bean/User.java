package com.hbsi.demo1.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author JLW
 * @create 2021-05-21 20:06
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "userbody")
public class User {
    private String name;
    private String age;
    private String gender;
}
