package com.spring.mybatis.repository;

import com.spring.mybatis.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     * 新增用户
     * @param user
     * @return
     */
    int save (User user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int update (User user);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    int deleteById (Long id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    User selectById (Long id);

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> selectAll ();
}
