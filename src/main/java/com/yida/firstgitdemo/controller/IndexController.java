package com.yida.firstgitdemo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    public String index(Model model) {
        return "hello world";
    }
}
