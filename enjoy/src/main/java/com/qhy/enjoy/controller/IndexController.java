package com.qhy.enjoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping(value="/index")
    public ModelAndView index(){

        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        mav.addObject("name","渠红元");
        mav.addObject("oss","hello oss");
        return mav;
    }

    @RequestMapping(value="/helloWorld")
    public ModelAndView helloWorld(){

        ModelAndView mav = new ModelAndView();
        mav.setViewName("helloWorld");
        mav.addObject("title","欢迎使用layui");
        return mav;
    }
    @RequestMapping(value="/layoutIndex")
    public ModelAndView layoutIndex(){

        ModelAndView mav = new ModelAndView();
        mav.setViewName("index/index");
        mav.addObject("name","渠红元");
        mav.addObject("oss","hello oss");
        return mav;
    }

}
