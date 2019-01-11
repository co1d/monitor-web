package com.ihzsr.mweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sql")
public class SqlController
{

    @RequestMapping("/message1")
    @ResponseBody
    public String message1()
    {
        return "我还活着1";
    }

    @RequestMapping("/message2")
    @ResponseBody
    public String message2()
    {
        return "我还活着2";
    }

    @RequestMapping("/message3")
    @ResponseBody
    public String message3()
    {
        return "我还活着3";
    }

    @RequestMapping("/message4")
    @ResponseBody
    public String message4()
    {
        return "我还活着4";
    }

    @RequestMapping("/message5")
    @ResponseBody
    public String message5()
    {
        return "我还活着5";
    }
}
