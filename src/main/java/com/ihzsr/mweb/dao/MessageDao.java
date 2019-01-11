package com.ihzsr.mweb.dao;

import com.ihzsr.mweb.bean.History;
import com.ihzsr.mweb.bean.Messages;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface MessageDao {
	
	void add(Messages message);
	
	Messages queryAllMessage(Integer hostId);
	
	void deleteMessage(@Param("companyCode") String companyCode, @Param("ip") String ip);
	
	List<History> queryHistory(@Param("companyCode") String companyCode, @Param("ip") String ip, @Param("sort") String sort, @Param("day") String day, @Param("frequency") String frequency);
	
	
	String queryCompanyId(@Param("companyCode") String companyCode);
	
	void addTest(Messages messages);
}
