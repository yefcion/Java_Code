package com.yefcion.springboothello.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2020.7.2 23:59
 */
@Component
@Data
@ToString
public class Dog {
    private String name;
    private Integer age;
}
