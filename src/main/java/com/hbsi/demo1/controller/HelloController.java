package com.hbsi.demo1.controller;



import com.hbsi.demo1.bean.TestUser;
import com.hbsi.demo1.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.*;

/**
 * @author JLW
 * @create 2021-05-21 16:13
 */
@RestController
@EnableConfigurationProperties({User.class,TestUser.class})
public class HelloController {

    @Autowired
    private User user;

    @Autowired
    private TestUser testUser;

    @Value("${offcn_ip}")
    private String offcn_ip;

    @Value("${offcn_port}")
    private String offcn_port;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(){
        return "hello spring boot...";
    }

    @GetMapping("/getvalue")
    public String getvalue(){
        return offcn_ip + ":" + offcn_port;
    }

    @GetMapping("/getuser")
    public String getuser(){
        return user.toString();
    }

    @GetMapping("/gettestUser")
    public String gettestUser(){
        return testUser.toString();
    }

}
