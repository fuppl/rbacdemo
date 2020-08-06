package com.example.user.service;

import com.example.user.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@Slf4j
public class UserServiceTest {
    @Autowired
    private UserService service;

    @Test
    public void test_save() {
        User user = new User();
        user.setName("test");
        user.setPassword("123456");
        service.save(user);
    }

    @Test
    public void test_findAll() {
        service.list().forEach(user -> System.out.println(user.getName()));
    }

    @Test
    public void test_get() {
        User user = service.get(1);
        System.out.println(user.getName());
    }

    @Test
    public void test_update() {
        User user = new User();
        user.setId(2);
        user.setName("password");
        user.setPassword("456123");
        service.update(user,user.getId());
    }

    @Test
    public void test_delete() {
        service.delete(7);
    }

}
