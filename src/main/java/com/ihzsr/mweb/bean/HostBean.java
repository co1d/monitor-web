package com.ihzsr.mweb.bean;

public class HostBean
{
    private Integer hostId;
    private Integer companyId;
    private String intranetIP;
    private String cpuModel;
    private Integer cpuNumber;
    private Integer cpuCoreNumber;
    private Double memoryCapacity;
    private Double diskCapacity;
    private String serverVersion;

    public Integer getHostId()
    {
        return hostId;
    }

    public void setHostId(Integer hostId)
    {
        this.hostId = hostId;
    }

    public Integer getCompanyId()
    {
        return companyId;
    }

    public void setCompanyId(Integer companyId)
    {
        this.companyId = companyId;
    }

    public String getIntranetIP()
    {
        return intranetIP;
    }

    public void setIntranetIP(String intranetIP)
    {
        this.intranetIP = intranetIP;
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

    public Double getMemoryCapacity()
    {
        return memoryCapacity;
    }

    public void setMemoryCapacity(Double memoryCapacity)
    {
        this.memoryCapacity = memoryCapacity;
    }

    public Double getDiskCapacity()
    {
        return diskCapacity;
    }

    public void setDiskCapacity(Double diskCapacity)
    {
        this.diskCapacity = diskCapacity;
    }

    public String getServerVersion()
    {
        return serverVersion;
    }

    public void setServerVersion(String serverVersion)
    {
        this.serverVersion = serverVersion;
    }

    @Override
    public String toString()
    {
        return "HostBean[" + "hostId=" + hostId + 
                ", companyId=" + companyId + ", intranetIP=" + intranetIP + 
                ", cpuModel=" + cpuModel  + ", cpuNumber=" + cpuNumber + 
                ", cpuCoreNumber=" + cpuCoreNumber + ", memoryCapacity=" + memoryCapacity + 
                ", diskCapacity=" + diskCapacity + ", serverVersion=" + serverVersion + ']';
    }
}
