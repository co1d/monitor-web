package com.ihzsr.mweb.dao;

import com.ihzsr.mweb.bean.Messages;

public interface MonitorDataDao
{
    Integer queryCompanyId(String companyCode);
    
    Integer queryHostId(Messages messages);
    
    void saveHostInfo(Messages messages);
    
    void add(Messages messages);
}
