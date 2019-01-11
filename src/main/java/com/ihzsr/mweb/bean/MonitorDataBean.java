package com.ihzsr.mweb.bean;

import java.util.Date;

public class MonitorDataBean
{
    private Integer hostId;
    private Date dataSaveTime;
    private Double cpuUsageRate;
    private Double memoryUsageRate;
    private Double diskUsageRate;
    private String serverRuntime;
    private String intranetIP;
    private String loadAverage;
    
    private HostBean hostBean;

    @Override
    public String toString()
    {
        return "MonitorDataBean[" + "hostId=" + hostId + ", dataSaveTime=" + dataSaveTime + 
                ", cpuUsageRate=" + cpuUsageRate + ", memoryUsageRate=" + memoryUsageRate +
                ", diskUsageRate=" + diskUsageRate + ", serverRuntime=" + serverRuntime + 
                ", intranetIP=" + intranetIP  + ", loadAverage=" + loadAverage  + ']';
    }

    public Integer getHostId()
    {
        return hostId;
    }

    public void setHostId(Integer hostId)
    {
        this.hostId = hostId;
    }

    public Date getDataSaveTime()
    {
        return dataSaveTime;
    }

    public void setDataSaveTime(Date dataSaveTime)
    {
        this.dataSaveTime = dataSaveTime;
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

    public Double getDiskUsageRate()
    {
        return diskUsageRate;
    }

    public void setDiskUsageRate(Double diskUsageRate)
    {
        this.diskUsageRate = diskUsageRate;
    }

    public String getServerRuntime()
    {
        return serverRuntime;
    }

    public void setServerRuntime(String serverRuntime)
    {
        this.serverRuntime = serverRuntime;
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
}
