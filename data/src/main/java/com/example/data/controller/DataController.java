package com.example.data.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.data.service.RedisService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
public class DataController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "/getDataString")
    public String getDataString(@RequestParam Map<String,Object> params) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("hello", "hello");
        return jsonObject.toString();
    }

    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping(value = "/getDataString2", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getDataString2(@RequestBody String json, @RequestParam Map map)  {
        MultiValueMap<String,Object> multiValueMap = new LinkedMultiValueMap();
        multiValueMap.add("name","渠红元");
        multiValueMap.add("name","第二次添加");

//        ResponseEntity<String> forEntity = null;
//        try {
//            forEntity = restTemplate.getForEntity("http://data-provider/getDataString", String.class,multiValueMap);
//        } catch (RestClientException e) {
//            e.printStackTrace();
//        }
//        String body = forEntity.getBody();
//        System.out.println("body -----> " + body);

        return json;
    }

    private String fallback(@RequestBody String json, @RequestParam Map map) {
        System.out.println("body -----> 熔断了");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", "500");
        jsonObject.put("message", "熔断了");
        return jsonObject.toJSONString();
    }

    @RequestMapping(value = "/setKeyValue")
    public String setKeyValue(String key, String value) {
       redisService.setKeyValue(key, value);
        boolean expire = redisService.expire(key, 60L, TimeUnit.SECONDS);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code","200");
        jsonObject.put("message","操作成功");
        jsonObject.put("expire",expire);
        return jsonObject.toJSONString();
    }

    public static void main(String[] args) {

//        ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://data-provider/getDataString", String.class);
        ResponseEntity<String> forEntity = new RestTemplate().getForEntity("https://www.baidu.com", String.class);
        String body = forEntity.getBody();
        System.out.println("body -----> " + body);
    }
    
}
