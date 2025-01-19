package com.example.project.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {


    @GetMapping("hello")
     public String greet(){
        return  "Hello World";
    }

}
