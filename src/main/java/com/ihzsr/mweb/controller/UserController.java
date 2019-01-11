package com.ihzsr.mweb.controller;

import com.ihzsr.mweb.bean.User;
import com.ihzsr.mweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController
{

    @Autowired
    private UserService userService;

    //注册
    @RequestMapping("/register")
    @ResponseBody
    private String register(HttpServletRequest request, User user)
    {
        return userService.register(user);
    }

    //登录验证
    @RequestMapping("/checkLogin")
    @ResponseBody
    public String checkLogin(HttpServletRequest request)
    {
        String userName = request.getParameter("userName");
        String userPassword = request.getParameter("userPassword");
        User user = userService.checkLogin(userName, userPassword);
        if (user != null)
        {
            HttpSession session = request.getSession();
            session.setAttribute("userName", userName);
            return "success";
        }
        return "fail";
    }

    //主页
    @RequestMapping("/index")
    @ResponseBody
    public ModelAndView index()
    {
        return new ModelAndView("/home/main");
    }

    //登录
    @RequestMapping("/login")
    public String Login()
    {
        return "/login/login";
    }

    //注销
    @RequestMapping("/outLogin")
    public String outLogin(HttpSession session)
    {
        session.invalidate();
        return "/login/login";
    }

    //公司代码
    @RequestMapping("/companyId")
    @ResponseBody
    public Integer companyId(HttpServletRequest request)
    {
        String userName = request.getParameter("userName");
        return userService.queryCompanyId(userName);
    }
}