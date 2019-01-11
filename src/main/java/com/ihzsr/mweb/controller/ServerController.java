package com.ihzsr.mweb.controller;

import com.ihzsr.mweb.bean.Server;
import com.ihzsr.mweb.service.ServerService;
import com.ihzsr.mweb.util.LayuiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/server")
public class ServerController
{

    @Autowired
    private ServerService serverService;

    @RequestMapping("/queryServerName")
    @ResponseBody
    public List<Server> serverName(Integer companyId)
    {
        List<Server> servers=serverService.queryServerName(companyId);
        System.out.println(servers);
        return servers;
    }

    @RequestMapping("/refresh")
    @ResponseBody
    private void refresh(HttpServletRequest request)
    {
        String companyCode = request.getParameter("companyCode");
        serverService.refresh(companyCode);
    }

    @RequestMapping("/queryHostId")
    @ResponseBody
    private String queryServerData(HttpServletRequest request)
    {
        String serverName = request.getParameter("serverName");
        Integer companyId = Integer.valueOf(request.getParameter("companyId"));
        return serverService.queryHostId(serverName, companyId);
    }

    @RequestMapping("/sMessage")
    @ResponseBody
    private Server querySMessage(HttpServletRequest request)
    {
        String ip = request.getParameter("ip");
        String companyCode = request.getParameter("companyCode");
        Server server = serverService.querySMessage(ip, companyCode);
        return server;
    }

    @RequestMapping("/updateServer")
    @ResponseBody
    private void updateServer(HttpServletRequest request, Server server)
    {
        serverService.updateServer(server);
    }

    @RequestMapping("/list")
    @ResponseBody
    public LayuiModel list(String companyCode)
    {
        LayuiModel model = new LayuiModel();
        List<Server> list = serverService.queryAll(companyCode);
        model.setData(list);
        return model;
    }

    @RequestMapping("/deleteServer")
    @ResponseBody
    private void deleteServer(HttpServletRequest request)
    {
        String ip = request.getParameter("ip");
        String companyCode = request.getParameter("companyCode");
        serverService.deleteServer(ip, companyCode);
    }
}