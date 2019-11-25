package com.sunliang.testservicea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 侨居
 * @version 1.0.0
 * @ClassName SayHello.java
 * @Description TODO
 * @date 2019年11月25日 22:26:00
 */
@RestController
public class SayHello {

    @GetMapping(value = "/hi")
    public String sayHi(){
        return "hi-springCloud";
    }
}
