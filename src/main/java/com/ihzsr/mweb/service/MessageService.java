package com.ihzsr.mweb.service;

import com.ihzsr.mweb.bean.History;
import com.ihzsr.mweb.bean.Messages;

import java.util.List;

public interface MessageService
{

    void add(Messages message);

    Messages queryAllMessage(Integer hostId);

    void deleteMessage(String companyCode, String ip);

    List<History> queryHistory(String companyCode, String ip, String sort, String day, String frequency);
}
