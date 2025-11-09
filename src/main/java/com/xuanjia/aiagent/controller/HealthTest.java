package com.xuanjia.aiagent.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/health")
public class HealthTest {

    @GetMapping("/test")
    public String test(){

        List<String> s = new ArrayList<>();
        s.toArray(new String[s.size()]);
        char[] size = new char[3];
        String s1 = "12";
        s1.length();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int size1 = list.size();
        return "Hello!";

    }
}
