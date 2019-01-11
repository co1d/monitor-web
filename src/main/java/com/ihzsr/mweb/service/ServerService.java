package com.ihzsr.mweb.service;

import com.ihzsr.mweb.bean.Server;

import java.util.List;

public interface ServerService
{

    List<Server> queryServerName(Integer companyId);

    void refresh(String companyCode);

    String queryHostId(String serverName, Integer companyId);

    Server querySMessage(String ip, String companyCode);

    void updateServer(Server server);

    List<Server> queryAll(String companyCode);

    void deleteServer(String ip, String companyCode);
}
