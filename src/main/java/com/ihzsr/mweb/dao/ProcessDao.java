package com.ihzsr.mweb.dao;

import com.ihzsr.mweb.bean.Process;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProcessDao {
	
	List<Process> queryAll(@Param("ip") String ip, @Param("companyCode") String companyCode);
	
	void addProcess(Process process);
	
	void deleteProcess(@Param("ip") String ip, @Param("companyCode") String companyCode);
	
}
