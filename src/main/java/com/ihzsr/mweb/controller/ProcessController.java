package com.ihzsr.mweb.controller;

import com.ihzsr.mweb.bean.Process;
import com.ihzsr.mweb.service.ProcessService;
import com.ihzsr.mweb.util.LayuiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/proccer")
public class ProcessController
{

    @Autowired
    private ProcessService processService;

    @RequestMapping("/list")
    @ResponseBody
    public LayuiModel list(String ip, String companyCode)
    {
        LayuiModel model = new LayuiModel();
        List<Process> list = processService.queryAll(ip, companyCode);
        model.setData(list);
        return model;
    }
}
