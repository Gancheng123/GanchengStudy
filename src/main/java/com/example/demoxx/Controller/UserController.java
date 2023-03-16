package com.example.demoxx.Controller;

import com.example.demoxx.entity.User;
import com.example.demoxx.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/user")
    public String query(){
        List<User> list = userMapper.find();
        System.out.println(list);
        return "查询用户";
    }
}
