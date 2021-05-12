package qhy.example.cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import qhy.example.service.modules.dao.dictionary.DictionaryDao;
import qhy.example.service.modules.service.dictionary.DictionaryService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping(value = "list")
public class HelloController {

    @Autowired
    private DictionaryService dictionaryDao;

    @RequestMapping(value = "/list")
    public Object getDictionaryList(HttpServletResponse response) {

        Cookie cookie = new Cookie("qhy", UUID.randomUUID().toString());
        cookie.setPath("/");
        cookie.setDomain(".qhy.com");
        cookie.setHttpOnly(true);
        cookie.setSecure(true);
        response.addCookie(cookie);

       return dictionaryDao.list();
    }

    @RequestMapping(value = "/getCookies",produces = MediaType.APPLICATION_JSON_VALUE)
    public Object getCookies(HttpServletRequest request) {

        Cookie[] cookies = request.getCookies();
        if(cookies != null) {
            for(Cookie cookie : cookies) {
                System.out.println(cookie.getDomain());
                System.out.println(cookie.getPath());
                System.out.println(cookie.getName());
                System.out.println(cookie.getValue());
            }
        }

        Map map  = new HashMap<>();
        map.put("aa","bb");
        return map;
    }
}
