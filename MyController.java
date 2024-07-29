package com.spring.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class MyController {

    @GetMapping("getSum")
    public String getSum(@RequestParam int num1, @RequestParam int num2) {
        int val=num1+num2;
        return "Total ="+val;
    }    
    
    
}
