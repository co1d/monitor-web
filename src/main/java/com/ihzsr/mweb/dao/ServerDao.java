package com.ihzsr.mweb.dao;

import com.ihzsr.mweb.bean.Server;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ServerDao {
	
	List<Server> queryServerName(@Param(value = "companyId") Integer companyId);
	
	void refresh(@Param(value = "companyCode") String companyCode);
	
	void addSettings(@Param(value = "companyCode") String companyCode);
	
	String queryHostId(@Param(value = "serverName") String serverName, @Param(value = "companyId") Integer companyId);
	
	Server querySMessage(@Param(value = "ip") String ip, @Param(value = "companyCode") String companyCode);
	
	void updateServer(Server server);
	
	List<Server> queryAll(@Param(value = "companyCode") String companyCode);
	
	void deleteServer(@Param(value = "ip") String ip, @Param(value = "companyCode") String companyCode);
	
	void deleteSettings(@Param(value = "ip") String ip, @Param(value = "companyCode") String companyCode);
	
}
