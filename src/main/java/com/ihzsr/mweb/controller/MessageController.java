package com.ihzsr.mweb.controller;

import com.ihzsr.mweb.bean.History;
import com.ihzsr.mweb.bean.Messages;
import com.ihzsr.mweb.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/message")
public class MessageController
{

    @Autowired
    private MessageService messageService;

    @RequestMapping("/queryHostData")
    @ResponseBody
    public Messages queryHostData(HttpServletRequest request)
    {
        Integer hostId = Integer.valueOf(request.getParameter("hostId"));
        Messages message = messageService.queryAllMessage(hostId);
        return message;
    }

    @RequestMapping("/deleteMessage")
    @ResponseBody
    public void deleteMessage(HttpServletRequest request)
    {
        String companyCode = request.getParameter("companyCode");
        String ip = request.getParameter("ip");
        messageService.deleteMessage(companyCode, ip);
    }

    @RequestMapping("/queryHistory")
    @ResponseBody
    public List<History> queryHistory(HttpServletRequest request)
    {
        String companyCode = request.getParameter("companyCode");
        String ip = request.getParameter("ip");
        String sort = request.getParameter("sort");
        String day = request.getParameter("day");
        String frequency = request.getParameter("frequency");
        List<History> list = messageService.queryHistory(companyCode, ip, sort, day, frequency);
        return list;
    }
}
