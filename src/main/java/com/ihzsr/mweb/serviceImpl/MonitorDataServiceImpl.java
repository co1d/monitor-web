package com.ihzsr.mweb.serviceImpl;

import com.ihzsr.mweb.bean.Messages;
import com.ihzsr.mweb.dao.MonitorDataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class MonitorDataServiceImpl
{
    @Autowired
    private MonitorDataDao monitorDataDao;
    
    public void add(Messages messages)
    {
        Integer companyId=monitorDataDao.queryCompanyId(messages.getCompanyCode());
        Lock lock = new ReentrantLock();    //注意这个地方
        if(companyId!=null)
        {
            //messages.setCompanyId(companyId);
            //monitorDataDao.saveHostInfo(messages);
            //System.out.println(monitorDataDao.queryHostId(messages));
            //messages.setHostId(monitorDataDao.queryHostId(messages));
            //System.out.println(messages.getHostId());
            //monitorDataDao.add(messages);

            messages.setCompanyId(companyId);
            lock.lock();
            try {
                monitorDataDao.saveHostInfo(messages);
            } catch (Exception e) {
                
            }finally {
                lock.unlock();
            }
            messages.setHostId(monitorDataDao.queryHostId(messages));
            monitorDataDao.add(messages);
        }
    }
}
