package com.ihzsr.mweb.controller;

import com.ihzsr.mweb.bean.Settings;
import com.ihzsr.mweb.service.SettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/settings")
public class SettingsController
{

    @Autowired
    private SettingsService settingsService;

    @RequestMapping("/queryAll")
    @ResponseBody
    public Settings queryAllSettings(HttpServletRequest request)
    {
        String ip = request.getParameter("ip");
        String companyCode = request.getParameter("companyCode");
        Settings settings = settingsService.queryAllSettings(ip, companyCode);
        return settings;
    }

    @RequestMapping("/update")
    @ResponseBody
    public void updateSettings(HttpServletRequest request, Settings settings)
    {
        settingsService.updateSettings(settings);
    }
}
