package com.example.user.mapper;

import com.example.user.dao.UserMapper;
import com.example.user.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class UserMapperTest {
    @Autowired
    private UserMapper mapper;

    @Test
    public void test_save() {
        User user = new User();
        user.setName("123456");
        user.setPassword("123456");
        mapper.save(user);
    }

    @Test
    public void test_get() {
        User user = mapper.get(1);
        System.out.println(user.getName());
    }

    @Test
    public void test_update() {
        User user = new User();
        user.setId(1);
        user.setName("update");
        user.setPassword("456123");
        mapper.update(user);
    }

    @Test
    public void test_delete() {
        mapper.deleteById(6);
    }
}
