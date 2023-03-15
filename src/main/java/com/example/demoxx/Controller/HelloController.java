package com.example.demoxx.Controller;

import com.example.demoxx.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping(value = "/hl", method = RequestMethod.GET)
    public String hello(@RequestParam(value = "nickname", required = false) String name) {
        return "1" + name;
    }

    @RequestMapping(value = "Post3",method = RequestMethod.POST)
    public String postTest3(@RequestBody User user)
    {
        System.out.println(user.getUserage());
        System.out.println(user.getUsername());
        System.out.println(user);
        return "user";
    }
}
