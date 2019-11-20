package com.sjm.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class CalcController {

    @GetMapping
    public String status() {
        return "OK";
    }

    @GetMapping("/add")
    public Integer add( @RequestParam Integer a, @RequestParam Integer b){
        Integer c = a + b;
        return c;
    }
}