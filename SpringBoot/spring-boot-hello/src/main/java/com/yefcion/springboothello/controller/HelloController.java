package com.yefcion.springboothello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2019/10/27 21:52
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot 2.0!";
    }
}
