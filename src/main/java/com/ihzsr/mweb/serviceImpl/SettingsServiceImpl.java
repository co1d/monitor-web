package com.ihzsr.mweb.serviceImpl;

import com.ihzsr.mweb.bean.Settings;
import com.ihzsr.mweb.dao.SettingsDao;
import com.ihzsr.mweb.service.SettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingsServiceImpl implements SettingsService
{

    @Autowired
    private SettingsDao settingsDao;

    @Override
    public Settings queryAllSettings(String ip, String companyCode)
    {
        Settings settings = settingsDao.queryAllSettings(ip, companyCode);
        return settings;
    }

    @Override
    public void updateSettings(Settings settings)
    {
        settingsDao.updateSettings(settings);
    }
}
