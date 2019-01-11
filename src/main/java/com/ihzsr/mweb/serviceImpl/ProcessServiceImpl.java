package com.ihzsr.mweb.serviceImpl;

import com.ihzsr.mweb.bean.Process;
import com.ihzsr.mweb.dao.ProcessDao;
import com.ihzsr.mweb.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcessServiceImpl implements ProcessService
{

    @Autowired
    private ProcessDao processDao;

    @Override
    public List<Process> queryAll(String ip, String companyCode)
    {
        return processDao.queryAll(ip, companyCode);
    }

    @Override
    public void addProcess(Process process)
    {
        processDao.addProcess(process);
    }

    @Override
    public void deleteProcess(String ip, String companyCode)
    {
        processDao.deleteProcess(ip, companyCode);
    }

}
