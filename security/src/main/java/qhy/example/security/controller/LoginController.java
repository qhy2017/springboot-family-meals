package qhy.example.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登陆
 *@auth qhy
 *@email 1242359237@qq.com
 *@date 2020/5/20 7:04
 */
@Controller
public class LoginController {

    @RequestMapping(value = {"index"})
    public String  login(){
        return "index";
    }
    @RequestMapping(value = "from")
    public String form(String username){

       System.out.println(username);
        return "main";
    }
}
