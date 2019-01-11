package com.ihzsr.mweb.test;

import com.ihzsr.mweb.service.SettingsService;
import com.ihzsr.mweb.util.SendMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController
{
    @Autowired
    private SendMail sendMail;
    @Autowired
    private SettingsService settingsService;

    @RequestMapping("/mail")
    @ResponseBody
    public String mail()
    {
        sendMail.sendMail("913456686@qq.com", "杭州思软服务器监控平台告警", "测试");
        return "发送成功";
    }
}
