package com.ihzsr.mweb.dao;

import com.ihzsr.mweb.bean.Settings;
import org.apache.ibatis.annotations.Param;


public interface SettingsDao {
	
	Settings queryAllSettings(@Param("ip") String ip, @Param("companyCode") String companyCode);
	
	void updateSettings(Settings settings);
	
}
