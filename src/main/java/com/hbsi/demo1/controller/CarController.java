package com.hbsi.demo1.controller;

import com.hbsi.demo1.po.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author JLW
 * @create 2021-05-21 16:24
 */
@RestController
@RequestMapping("/")
public class CarController {

    @RequestMapping("/findOneCar")
    public Car findOneCar(){
        Car car = new Car(1,"toyo",9999.99F,new Date());
        return car;
    }

    @RequestMapping("/findAll")
    public List<Car> findAll(){
        ArrayList<Car> list = new ArrayList<>();
        Car car1 = new Car(1, "toyo", 1999.99F,new Date());
        Car car2= new Car(2, "dazhong", 2999.99F,new Date());
        Car car3 = new Car(3, "fengtian", 3999.99F,new Date());
        Car car4 = new Car(4, "benchi", 4999.99F,new Date());
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        return list;
    }

}
