package com.qhy.enjoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageIndexController {

    @RequestMapping("view/console/console1.html")
    public ModelAndView consoleHtml(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("view/console/console1");
        mav.addObject("name","渠红元");
        mav.addObject("oss","hello oss");
        return mav;
    }
}
