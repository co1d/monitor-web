package com.ihzsr.mweb.serviceImpl;

import com.ihzsr.mweb.bean.Record;
import com.ihzsr.mweb.dao.RecordDao;
import com.ihzsr.mweb.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService
{

    @Autowired
    private RecordDao recordDao;

    @Override
    public void add(Record record)
    {
        recordDao.add(record);
    }

    @Override
    public List<Record> queryAllRecord(String ip, String companyCode)
    {
        return recordDao.queryAllRecord(ip, companyCode);
    }

    @Override
    public void delete(String id, String companyCode)
    {
        recordDao.delete(id, companyCode);
    }

}
