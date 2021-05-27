package com.hbsi.demo1.controller;

import com.hbsi.demo1.bean.Stu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @author JLW
 * @create 2021-05-21 21:14
 */
@RestController
@RequestMapping("/stu")
public class StuController {

    private List<Stu> stuList = Collections.synchronizedList(new ArrayList<Stu>());

    /***
     * 获取全部用户信息
     * @return
     */
    @GetMapping("/")
   public List<Stu> getStuList(){
       return stuList;
   }

    /***
     * 新增用户
     * @param stu
     * @return
     */
    @PostMapping("/")
    public String createStuList(Stu stu) {
        stuList.add(stu);
        return "seccess";
    }


    /***
     * 获取指定id用户信息
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Stu findOne(@PathVariable("id") Long id) {
        for (Stu stu : stuList) {
            if (stu.getId() == id) {
                return stu;
            }
        }
        return null;
    }

    /**
     * 更新指定id用户信息
     * @param id
     * @param
     * @return
     */
    @PutMapping("/{id}")
    public String updateUser(@PathVariable("id") Long id,Stu stu) {
        for (Stu stu1 : stuList) {
            if(stu1.getId()==id) {
                stu1.setName(stu1.getName());
                stu1.setAge(stu1.getAge());
            }
        }
        return "success";
    }



    /***
     * 删除指定id用户
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
     public String deleteUser(@PathVariable("id") Long id) {
         stuList.remove(findOne(id));
         return "success";
     }


}
