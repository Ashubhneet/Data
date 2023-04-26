package com.restapi.restapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloControler {
    @GetMapping(path = "/hello")
    public String helloworld(){
        return "hi hello its me";
    }
    @GetMapping(path = "/hello_bean")
    public hellobean hellobean(){
        return new hellobean("hello world");
    }
    @GetMapping(path = "/hello/path_variable/{name}")
    public hellobean hellopathvarible(@PathVariable String name){
        return new hellobean(String.format("hello world by path varibale, %s", name));
    }
}
