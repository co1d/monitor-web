package com.ihzsr.mweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/iframe")
public class IframeController
{
    // register页面
    @RequestMapping("/register")
    @ResponseBody
    public ModelAndView register()
    {
        return new ModelAndView("/login/register");
    }

    // message页面
    @RequestMapping("/message")
    @ResponseBody
    public ModelAndView message()
    {
        return new ModelAndView("/iframe/message");
    }

    // server页面
    @RequestMapping("/server")
    @ResponseBody
    public ModelAndView server()
    {
        return new ModelAndView("/iframe/server");
    }

    // history页面
    @RequestMapping("/history")
    @ResponseBody
    public ModelAndView history()
    {
        return new ModelAndView("/iframe/history");
    }

    // serverList页面
    @RequestMapping("/serverList")
    @ResponseBody
    public ModelAndView serverList()
    {
        return new ModelAndView("/iframe/serverList");
    }

    // settings页面
    @RequestMapping("/settings")
    @ResponseBody
    public ModelAndView settings()
    {
        return new ModelAndView("/iframe/settings");
    }

    // record页面
    @RequestMapping("/record")
    @ResponseBody
    public ModelAndView record()
    {
        return new ModelAndView("/iframe/record");
    }
}
