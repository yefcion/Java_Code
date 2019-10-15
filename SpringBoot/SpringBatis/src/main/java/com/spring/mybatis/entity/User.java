package com.spring.mybatis.entity;

import lombok.Data;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2019/10/15 22:10
 */
@Data
public class User {

    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别 1=男 2=女 其他=保密
     */
    private Integer sex;
}
