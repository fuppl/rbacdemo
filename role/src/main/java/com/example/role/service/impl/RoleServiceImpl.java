package com.example.role.service.impl;

import com.example.role.dao.RoleMapper;
import com.example.role.entity.Role;
import com.example.role.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper mapper;

    @Override
    public Role save(Role role) {
        mapper.save(role);
        return role;
    }

    @Override
    public Role get(Integer id) {
        return mapper.get(id);
    }

    @Override
    public List<Role> list() {
        return mapper.list();
    }

    @Override
    public Role update(Role role) {
        mapper.update(role);
        return role;
    }

    @Override
    public void delete(Integer id) {
        mapper.deleteById(id);
    }
}
