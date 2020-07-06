package com.yefcion.springboothello.config;

import com.yefcion.springboothello.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author： xu.yefcion
 * @description：配置类
 * @Configuration 用来指明当前类是一个配置类，用来替代以前的 Spring 配置文件
 * 在配置文件中用 <bean><bean/> 标签添加组件
 * @date： 2020.7.6 23:35
 */
@Configuration
public class MyAppConfig {

    /**
     * 将方法的返回值添加到容器中，容器中这个组件默认的 id 就是方法名
     */
    @Bean
    public HelloService helloService() {
        System.out.println("contain");
        return new HelloService();
    }

}
