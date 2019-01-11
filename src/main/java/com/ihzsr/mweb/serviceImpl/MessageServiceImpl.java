package com.ihzsr.mweb.serviceImpl;

import com.ihzsr.mweb.bean.History;
import com.ihzsr.mweb.bean.Messages;
import com.ihzsr.mweb.dao.MessageDao;
import com.ihzsr.mweb.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService
{

    @Autowired
    private MessageDao messageDao;

    @Override
    public void add(Messages message)
    {
        messageDao.add(message);
    }

    @Override
    public Messages queryAllMessage(Integer hostId)
    {
        Messages message = messageDao.queryAllMessage(hostId);
        return message;
    }

    @Override
    public void deleteMessage(String companyCode, String ip)
    {
        messageDao.deleteMessage(companyCode, ip);
    }

    @Override
    public List<History> queryHistory(String companyCode, String ip, String sort, String day, String frequency)
    {
        return messageDao.queryHistory(companyCode, ip, sort, day, frequency);
    }

    //public String queryCompanyId()
}
