package cn.com.chinahitech.buybox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping ("/sayHi")
    public String sayHi(){
        return "Hello World!";
    }
}
//  http://localhost:8080/sayHi