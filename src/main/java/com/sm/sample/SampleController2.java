package com.sm.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController2 {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name","sangmoon");
        return "hello";
    }

}
