package qhy.example.web.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import qhy.example.bean.student.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @auth qhy
 * @email 1242359237@qq.com
 * @date
 */
public class Util {

    public static void main(String[] args) {
//        RestTemplate restTemplate = new RestTemplate();
//        String forObject = restTemplate.getForObject("http://www.baidu.com", String.class);
//        System.out.println(forObject);
        Map<String,Object> map = new HashMap();
        String str = (String) map.get("str");
        System.out.println(StringUtils.isNoneBlank(str));
        Gson gson = new Gson();
        Student s = new Student();
        s.setDataId(UUID.randomUUID().toString());
        String json = gson.toJson(s);
        System.out.println(json);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("hello", "shide");
        System.out.println(new Gson().toJson(jsonObject));
    }
}
