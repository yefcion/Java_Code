package com.yefcion.springboothello;

import com.yefcion.springboothello.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplicationTests {

    /**
     * slf4j + logback
     * SpringBoot 整合 Slf4j+logback 日志框架 https://www.cnblogs.com/gavincoder/p/10090592.html
     */
    private final static Logger logger = LoggerFactory.getLogger(HelloApplicationTests.class);

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService() {
        System.out.println(ioc.containsBean("helloService"));
    }

    @Test
    public void contextLoads() {
        System.out.println("Hello Spring Boot 2.0!");
        logger.info("log4j");
        System.out.println(person);
    }

}
