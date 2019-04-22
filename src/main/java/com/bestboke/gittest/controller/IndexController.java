package com.bestboke.gittest.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping(value = {"/", "index.html"})
    @ResponseBody
    public String index(){
        return "测试自动部署 啊哈哈哈或";
    }

    @PostMapping("json")
    @ResponseBody
    public String jsonTest(@RequestBody JSONObject jsonObject){
        return jsonObject.toJSONString();
    }





}