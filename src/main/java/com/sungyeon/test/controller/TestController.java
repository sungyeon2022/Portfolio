package com.sungyeon.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/test")
@Controller
public class TestController {
    @RequestMapping("/about")
    public ModelAndView adout(){
        ModelAndView md = new ModelAndView("test/about");
        return md;
    }
    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView md = new ModelAndView("test/index");
        return md;
    }
}
