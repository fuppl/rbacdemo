package com.example.role.controller;

import com.example.role.entity.Role;
import com.example.role.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/role")
public class RoleController {

    @Autowired
    private RoleService service;

    @GetMapping("/roles")
    public Map list(HttpSession session) {
        List<Role> list = service.list();
        session.setAttribute("roles",list);
        Map map = new HashMap();
        map.put("roles",list);
        return map;
    }

    @GetMapping("/roles/{id}")
    public Map list(HttpSession session, @PathVariable Integer id) {
        Role role = service.get(id);
        session.setAttribute("role",role);
        Map map = new HashMap();
        map.put("role",role);
        return map;
    }

    @PostMapping("/roles/role")
    public Map save(HttpSession session, @RequestBody Role role) {
        Role save = service.save(role);
        session.setAttribute("role",save);
        Map map = new HashMap();
        map.put("role",role);
        return map;
    }

    @PatchMapping("/roles/{id}")
    public Map update(HttpSession session, @RequestBody Role role, @PathVariable Integer id) {
        Role update = service.update(role);
        session.setAttribute("updateRole",update);
        Map map = new HashMap();
        map.put("updateRole",update);
        return map;
    }

    @DeleteMapping("/roles/{id}")
    public Map delete(HttpSession session, @PathVariable Integer id) {
        service.delete(id);
        session.setAttribute("delete successfully", true);
        Map map = new HashMap();
        map.put("delete successfully", true);
        return map;
    }
}
