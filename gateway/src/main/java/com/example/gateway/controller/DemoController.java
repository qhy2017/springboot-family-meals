package com.example.gateway.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value = "/getString")
    public String getString(){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code","200");
        jsonObject.put("message","成功");
        return jsonObject.toJSONString();
    }
}
