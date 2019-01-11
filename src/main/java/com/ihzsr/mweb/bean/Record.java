package com.ihzsr.mweb.bean;

import java.util.Date;

public class Record
{
    private String companyCode;
    private Integer id;
    private String ip;
    private Date time = new java.sql.Date(new Date().getTime());
    private String type;
    private String text;


    public String getCompanyCode()
    {
        return companyCode;
    }

    public void setCompanyCode(String companyCode)
    {
        this.companyCode = companyCode;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getIp()
    {
        return ip;
    }

    public void setIp(String ip)
    {
        this.ip = ip;
    }

    public Date getTime()
    {
        return time;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    @Override
    public String toString()
    {
        return "Record [companyCode=" + companyCode + ", id=" + id + ", ip=" + ip + ", time=" + time + ", type=" + type + ", text=" + text + "]";
    }
}
