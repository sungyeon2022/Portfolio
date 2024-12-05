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
    @RequestMapping("/service")
    public ModelAndView service(){
        ModelAndView md = new ModelAndView("test/service");
        return md;
    }
    @RequestMapping("/why")
    public ModelAndView why(){
        ModelAndView md = new ModelAndView("test/why");
        return md;
    }
    @RequestMapping("/team")
    public ModelAndView team(){
        ModelAndView md = new ModelAndView("test/team");
        return md;
    }
}
