package com.bestboke.gittest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping(value = {"/", "index.html"})
    @ResponseBody
    public String index(){
        return "测试自动部署 啊哈哈哈或";
    }

}