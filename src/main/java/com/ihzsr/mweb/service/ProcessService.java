package com.ihzsr.mweb.service;

import com.ihzsr.mweb.bean.Process;

import java.util.List;

public interface ProcessService
{

    List<Process> queryAll(String ip, String companyCode);

    void addProcess(Process process);

    void deleteProcess(String ip, String companyCode);

}
