package com.ihzsr.mweb.service;

import com.ihzsr.mweb.bean.Settings;

public interface SettingsService
{

    Settings queryAllSettings(String ip, String companyCode);

    void updateSettings(Settings settings);

}
