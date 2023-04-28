package com.food.controller;


import com.food.model.Foods;
import com.food.services.FoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")


public class FoodsController {

    @Autowired
    private FoodsService foodsService;

    /*
    @PostMapping("/add")
    public String add(@RequestBody Student student){

        studentService.saveStudent(student);
        return "New Student is added";
    }
*/
    @GetMapping("/")



    @CrossOrigin
    public List<Foods> getAllFoods(){
        return foodsService.getAllFoods();
    }
}
