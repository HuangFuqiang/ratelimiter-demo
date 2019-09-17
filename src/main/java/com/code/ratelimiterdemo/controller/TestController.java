package com.code.ratelimiterdemo.controller;


import com.code.ratelimiterdemo.annotation.RateLimiterAspect;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @ResponseBody
    @RequestMapping("/test")
    @RateLimiterAspect
    public String test() {
        return "success";
    }
}
