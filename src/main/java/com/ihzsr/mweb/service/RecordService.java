package com.ihzsr.mweb.service;

import com.ihzsr.mweb.bean.Record;

import java.util.List;

public interface RecordService
{

    void add(Record record);

    List<Record> queryAllRecord(String ip, String companyCode);

    void delete(String id, String companyCode);

}
