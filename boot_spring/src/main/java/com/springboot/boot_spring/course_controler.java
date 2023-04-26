package com.springboot.boot_spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
public class course_controler {
@RequestMapping("/courses")
    public List<Course> retrive(){
        return Arrays.asList(
                new Course(1,"asd","add"),
                new Course(2,"dfvf","ggd"),
                new Course(3,"fsd","agbg")
        );

    }
}
