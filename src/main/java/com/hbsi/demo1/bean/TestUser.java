package com.hbsi.demo1.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author JLW
 * @create 2021-05-21 20:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Configuration
@PropertySource("classpath:test.properties")
@ConfigurationProperties(prefix = "testuser")
public class TestUser {
    private String name;
    private String password;
    private String birthday;

}
