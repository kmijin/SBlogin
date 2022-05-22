package com.example.SBlogin.Controller;

import com.example.SBlogin.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private TestService testService;

    @GetMapping("")
    public String test() {
        return "Root URL call";
    }

    @GetMapping("json")
    public Map<String, String> jsonTest() {
        Map<String, String> res = new HashMap<>();
        res.put("test", "hihi");

        return res;
    }

    @GetMapping("/test")
    public Map<String, String> testMethod() {
        Map<String, String> res = this.testService.getTest();

        return res;
    }
}
