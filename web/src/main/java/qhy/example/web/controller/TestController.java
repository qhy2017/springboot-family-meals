package qhy.example.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import qhy.example.bean.student.Student;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class TestController {

//    @Autowired(required=false)
//    @LoadBalanced
//    public RestTemplate restTemplate;


    @RequestMapping(value = "/getXList" ,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getObject(HttpServletRequest request, HttpServletResponse response) throws Exception {


//
//        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://data-provider/getDataString", String.class);
//        String body = forEntity.getBody();
//        System.out.println("body -----> " + body);

//
//        response.setHeader("Set-Cookie","qhy=9beaf7cb-22f2-4f2a-8a12-51c350f1c1a7" + Math.random() * 1000 + "; Domain=.qhy.com; Path=/; HttpOnly");
////        Cookie cookie = new Cookie("qhy", UUID.randomUUID().toString());
////        cookie.setPath("/");
////        cookie.setDomain(".qhy.com");
////        cookie.setHttpOnly(true);
//////        cookie.setSecure(true);
////        response.addCookie(cookie);
//        ObjectMapper o = new ObjectMapper();
//        Map map = new HashMap();
//        map.put("aa","bb");
//        String string = o.writeValueAsString(map);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("qq","qq");
        return jsonObject.toJSONString();
    }
}
