package qhy.example.web.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

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
    }
}
