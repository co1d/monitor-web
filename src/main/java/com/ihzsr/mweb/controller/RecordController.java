package com.ihzsr.mweb.controller;

import com.ihzsr.mweb.bean.Record;
import com.ihzsr.mweb.service.RecordService;
import com.ihzsr.mweb.util.LayuiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/record")
public class RecordController
{

    @Autowired
    private RecordService recordService;

    @RequestMapping("/queryAll")
    @ResponseBody
    public LayuiModel queryAllRecord(String ip, String companyCode)
    {
        LayuiModel model = new LayuiModel();
        List<Record> record = recordService.queryAllRecord(ip, companyCode);
        System.out.println(record);
        model.setData(record);
        return model;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public void delete(HttpServletRequest request)
    {
        String companyCode = request.getParameter("companyCode");
        String id = request.getParameter("id");
        recordService.delete(id, companyCode);
    }
}
