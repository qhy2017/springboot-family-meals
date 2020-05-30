package qhy.example.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import qhy.example.bean.student.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@ResponseBody
public class BeanController {

    @RequestMapping(value = "getBean")
    public Object getBean() throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,Object> map = new HashMap<>();
        map.put("name","我的");
        map.put("id", UUID.randomUUID().toString());
        map.put("date","2018-09-12 12:12:01");
        String s = objectMapper.writeValueAsString(map);
        Student bean = objectMapper.readValue(s,Student.class);
        return bean;
    }
}
