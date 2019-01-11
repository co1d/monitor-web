package com.ihzsr.mweb.serviceImpl;

import com.ihzsr.mweb.bean.Server;
import com.ihzsr.mweb.dao.ServerDao;
import com.ihzsr.mweb.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServerServiceImpl implements ServerService
{

    @Autowired
    private ServerDao serverDao;

    @Override
    public List<Server> queryServerName(Integer companyId)
    {
        return serverDao.queryServerName(companyId);
    }

    @Override
    public void refresh(String companyCode)
    {
        serverDao.refresh(companyCode);
        serverDao.addSettings(companyCode);
    }

    @Override
    public String queryHostId(String serverName, Integer companyId)
    {
        return serverDao.queryHostId(serverName, companyId);
    }

    @Override
    public Server querySMessage(String ip, String companyCode)
    {
        Server server = serverDao.querySMessage(ip, companyCode);
        return server;
    }

    @Override
    public void updateServer(Server server)
    {
        serverDao.updateServer(server);
    }

    @Override
    public List<Server> queryAll(String companyCode)
    {
        return serverDao.queryAll(companyCode);
    }

    @Override
    public void deleteServer(String ip, String companyCode)
    {
        serverDao.deleteServer(ip, companyCode);
        serverDao.deleteSettings(ip, companyCode);
    }
}
