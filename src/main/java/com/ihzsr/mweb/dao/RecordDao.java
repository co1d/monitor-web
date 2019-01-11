package com.ihzsr.mweb.dao;

import com.ihzsr.mweb.bean.Record;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface RecordDao {
	
	void add(Record record);
	
	List<Record> queryAllRecord(@Param("ip") String ip, @Param("companyCode") String companyCode);
	
	void delete(@Param("id") String id, @Param("companyCode") String companyCode);

}
