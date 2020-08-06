package com.example.user.controller;

import com.example.user.entity.User;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/user/")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("user")
    public Map save(HttpSession session, @RequestBody User user){
        service.save(user);
        session.setAttribute("user",user);

        Map map = new HashMap();
        map.put("user",user);
        return map;
    }

    @GetMapping("users")
    public Map list(HttpSession session) {
        List<User> list = service.list();
        session.setAttribute("users",list);

        Map map = new HashMap();
        map.put("users",list);
        return map;
    }

    @GetMapping("users/{id}")
    public Map get(HttpSession session, @PathVariable Integer id) {
        User user = service.get(id);
        session.setAttribute("user",user);
        Map map = new HashMap();
        map.put("user",user);
        return map;
    }

    @PatchMapping("users/{id}")
    public Map update(HttpSession session, @RequestBody User user, Integer id) {
        User update = service.update(user, id);
        session.setAttribute("updateUser",update);
        Map map = new HashMap();
        map.put("updateUser",update);
        return map;
    }

    @DeleteMapping("users/{id}")
    public Map delete(@PathVariable Integer id, HttpSession session) {
        service.delete(id);
        session.setAttribute("delete successfully",true);
        Map map = new HashMap();
        map.put("delete successfully",true);
        return map;
    }
}
