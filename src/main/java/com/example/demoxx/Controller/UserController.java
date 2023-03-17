package com.example.demoxx.Controller;

import com.example.demoxx.entity.User;
import com.example.demoxx.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public List<User> query() {
        List<User> list = userMapper.selectList(null);
        System.out.println(list);
        return list;
    }

    @GetMapping("/user/findAll")
    public List<User> find() {
//        List<User> list = userMapper.selectList(null);
        List<User> list = userMapper.selectAllUserAndOrders();
        System.out.println("list" + list);
        return userMapper.selectAllUserAndOrders();
    }

    @PostMapping("/user")
    public String save(User user) {
        int restr = userMapper.insert(user);
        if (restr > 0) {
            return "成功した";
        } else {
            return "失敗した";
        }
    }
}
