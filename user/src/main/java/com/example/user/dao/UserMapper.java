package com.example.user.dao;

import com.example.user.entity.User;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    void save(User user);

    void deleteById(Integer id);

    void update(User user);

    User get(Integer id);

    List<User> list();
}
