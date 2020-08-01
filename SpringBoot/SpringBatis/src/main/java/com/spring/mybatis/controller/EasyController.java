package com.spring.mybatis.controller;

import com.spring.mybatis.common.XRspEntity;
import com.spring.mybatis.entity.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author： xu.yefcion
 * @description：
 * @date： 2020.7.31 20:14
 */
@RestController
@Api(tags = "用户管理相关接口")
@RequestMapping("/user")
public class EasyController {
//    @PostMapping("/")
//    @ApiOperation("添加用户的接口")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "username", value = "用户名", defaultValue = "李四"),
//            @ApiImplicitParam(name = "address", value = "用户地址", defaultValue = "深圳", required = true)
//    })
//    public RespBean addUser(String username, @RequestParam(required = true) String address) {
//        return new RespBean();
//    }

    @ApiOperation("根据id查询用户的接口")
    @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "99", required = true)
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public XRspEntity<Person> getUserById() {
        XRspEntity<Person> xRspEntity = new XRspEntity<>();
        Person person = new Person();
        person.setId(99);
        xRspEntity.setData(person);
        return xRspEntity;
    }

    @ApiOperation("根据id更新用户的接口")
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public XRspEntity<Person> updateUserById(@RequestParam int id) {
        XRspEntity<Person> xRspEntity = new XRspEntity<>();
        Person person = new Person();
        person.setId(id);
        xRspEntity.setData(person);
        return xRspEntity;
    }
}
