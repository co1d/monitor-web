package com.ihzsr.mweb.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Messages
{
    private String companyCode;//公司代码
    
    private Integer hostId;
    
    private Integer companyId;

    private Date dataSaveTime = new Date();

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

    private String cpuModel;//CPU型号
    private Integer cpuNumber;//个数
    private Integer cpuCoreNumber;//核数
    private Double cpuUsageRate;//使用率

    private Double memoryUsageRate;//内存使用率
    private Double memoryCapacity;//容量

    private Double diskUsageRate;//磁盘使用率
    private Double diskCapacity;//容量

    private String serverRuntime;//系统运行时间
    private String serverVersion;//系统版本
    private String intranetIP;//IP
    private String loadAverage;//CPU平均负载

    public Integer getCompanyId()
    {
        return companyId;
    }

    public void setCompanyId(Integer companyId)
    {
        this.companyId = companyId;
    }

    public String getCompanyCode()
    {
        return companyCode;
    }

    public void setCompanyCode(String companyCode)
    {
        this.companyCode = companyCode;
    }

    public Date getDataSaveTime()
    {
        return dataSaveTime;
    }

    public String getCpuModel()
    {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel)
    {
        this.cpuModel = cpuModel;
    }

    public Integer getCpuNumber()
    {
        return cpuNumber;
    }

    public void setCpuNumber(Integer cpuNumber)
    {
        this.cpuNumber = cpuNumber;
    }

    public Integer getCpuCoreNumber()
    {
        return cpuCoreNumber;
    }

    public void setCpuCoreNumber(Integer cpuCoreNumber)
    {
        this.cpuCoreNumber = cpuCoreNumber;
    }

    public Double getCpuUsageRate()
    {
        return cpuUsageRate;
    }

    public void setCpuUsageRate(Double cpuUsageRate)
    {
        this.cpuUsageRate = cpuUsageRate;
    }

    public Double getMemoryUsageRate()
    {
        return memoryUsageRate;
    }

    public void setMemoryUsageRate(Double memoryUsageRate)
    {
        this.memoryUsageRate = memoryUsageRate;
    }

    public Double getMemoryCapacity()
    {
        return memoryCapacity;
    }

    public void setMemoryCapacity(Double memoryCapacity)
    {
        this.memoryCapacity = memoryCapacity;
    }

    public Double getDiskUsageRate()
    {
        return diskUsageRate;
    }

    public void setDiskUsageRate(Double diskUsageRate)
    {
        this.diskUsageRate = diskUsageRate;
    }

    public Double getDiskCapacity()
    {
        return diskCapacity;
    }

    public void setDiskCapacity(Double diskCapacity)
    {
        this.diskCapacity = diskCapacity;
    }

    public String getServerRuntime()
    {
        return serverRuntime;
    }

    public void setServerRuntime(String serverRuntime)
    {
        this.serverRuntime = serverRuntime;
    }

    public String getServerVersion()
    {
        return serverVersion;
    }

    public void setServerVersion(String serverVersion)
    {
        this.serverVersion = serverVersion;
    }

    public String getIntranetIP()
    {
        return intranetIP;
    }

    public void setIntranetIP(String intranetIP)
    {
        this.intranetIP = intranetIP;
    }

    public String getLoadAverage()
    {
        return loadAverage;
    }

    public void setLoadAverage(String loadAverage)
    {
        this.loadAverage = loadAverage;
    }

    public Integer getHostId()
    {
        return hostId;
    }

    public void setHostId(Integer hostId)
    {
        this.hostId = hostId;
    }

    @Override
    public String toString()
    {
        return "Message [companyCode=" + companyCode + ", dataSaveTime=" + df.format(new Date()) +
                ", cpuModel=" + cpuModel + ", cpuNumber=" + cpuNumber +", hostId="+hostId+
                ", cpuCoreNumber=" + cpuCoreNumber + ", cpuUsageRate=" + cpuUsageRate +
                ", memoryUsageRate=" + memoryUsageRate + ", memoryCapacity=" + memoryCapacity +
                ", diskUsageRate=" + diskUsageRate + ", diskCapacity=" + diskCapacity  + 
                ", serverRuntime=" + serverRuntime + ", serverVersion=" + serverVersion + 
                ", intranetIP=" + intranetIP + ", loadAverage=" + loadAverage + "]";
    }
}
