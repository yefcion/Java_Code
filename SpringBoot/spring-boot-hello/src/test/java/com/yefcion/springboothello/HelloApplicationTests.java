package com.yefcion.springboothello;

import com.yefcion.springboothello.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplicationTests {

    @Autowired
    Person person;

    @Test
    public void contextLoads() {
        System.out.println("Hello Spring Boot 2.0!");
        System.out.println(person);
    }

}
