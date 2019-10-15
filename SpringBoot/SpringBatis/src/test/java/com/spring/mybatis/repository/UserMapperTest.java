package com.spring.mybatis.repository;

import com.spring.mybatis.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void save() {
        User user = new User();
        user.setUsername("zzzz");
        user.setPassword("bbbb");
        user.setSex(1);
        user.setAge(18);
        // 返回插入的记录数 ，期望是1条 如果实际不是一条则抛出异常
        Assert.assertEquals(1,userMapper.save(user));
    }

    @Test
    public void update() {
        User user = new User();
        user.setId(1L);
        user.setPassword("newpassword");
        // 返回插入的记录数 ，期望是1条 如果实际不是一条则抛出异常
        Assert.assertEquals(1,userMapper.update(user));
    }

    @Test
    public void selectById() {
        Assert.assertNotNull(userMapper.selectById(1L));
    }

    @Test
    public void deleteById() {
        Assert.assertEquals(1,userMapper.deleteById(1L));
    }
}
