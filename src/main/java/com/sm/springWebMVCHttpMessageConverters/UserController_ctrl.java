package com.sm.springWebMVCHttpMessageConverters;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController_ctrl {

    @GetMapping("/helloGet")
    public @ResponseBody String hello(){
        return "hello";
    }

    @PostMapping("/user")
    public @ResponseBody User create(@RequestBody User user){
        return null;
    }
}
