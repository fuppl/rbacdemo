package com.example.user.service;

import com.example.user.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 保存用户
     * @param user 用户
     * @return 保存后的用户
     */
    User save(User user);

    /**
     * 列出所有用户
     * @return 所有用户
     */
    List<User> list();

    /**
     * 根据id获得用户
     * @param id id
     * @return 用户
     */
    User get(Integer id);

    /**
     * 更新用户
     * @param user 用户
     * @param id id
     * @return 更新后的用户
     */
    User update(User user, Integer id);

    /**
     * 根据id删除用户
     * @param id id
     */
    void delete(Integer id);
}
