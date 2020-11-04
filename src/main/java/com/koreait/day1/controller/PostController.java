package com.koreait.day1.controller;

import com.koreait.day1.model.MultiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostController {
    //localhost:9090/api/postMethod
    @PostMapping(value = "/postMethod")
    public MultiParam postMethod(@RequestBody MultiParam multiParam){
        return multiParam;
    }



}
