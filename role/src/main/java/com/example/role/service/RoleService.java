package com.example.role.service;

import com.example.role.entity.Role;

import java.util.List;

public interface RoleService {
    /**
     * 保存
     *
     * @param role
     * @return
     */
    Role save(Role role);

    /**
     * 查询
     *
     * @param id
     * @return
     */
    Role get(Integer id);

    /**
     * 查询所有
     *
     * @return
     */
    List<Role> list();

    /**
     * 修改
     *
     * @param role
     * @return
     */
    Role update(Role role);

    /**
     * 删除
     *
     * @param id
     */
    void delete(Integer id);
}
