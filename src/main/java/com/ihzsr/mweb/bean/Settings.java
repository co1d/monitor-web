package com.ihzsr.mweb.bean;

public class Settings
{
    private String companyCode;
    private String ip;
    private String cpu;
    private String memory;
    private String disk;
    private String cpumax;
    private String memorymax;
    private String diskmax;
    private String phone;
    private String email;


    public String getCompanyCode()
    {
        return companyCode;
    }

    public void setCompanyCode(String companyCode)
    {
        this.companyCode = companyCode;
    }

    public String getIp()
    {
        return ip;
    }

    public void setIp(String ip)
    {
        this.ip = ip;
    }

    public String getCpu()
    {
        return cpu;
    }

    public void setCpu(String cpu)
    {
        this.cpu = cpu;
    }

    public String getMemory()
    {
        return memory;
    }

    public void setMemory(String memory)
    {
        this.memory = memory;
    }

    public String getDisk()
    {
        return disk;
    }

    public void setDisk(String disk)
    {
        this.disk = disk;
    }

    public String getCpumax()
    {
        return cpumax;
    }

    public void setCpumax(String cpumax)
    {
        this.cpumax = cpumax;
    }

    public String getMemorymax()
    {
        return memorymax;
    }

    public void setMemorymax(String memorymax)
    {
        this.memorymax = memorymax;
    }

    public String getDiskmax()
    {
        return diskmax;
    }

    public void setDiskmax(String diskmax)
    {
        this.diskmax = diskmax;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    public String toString()
    {
        return "Settings [companyCode=" + companyCode + ", ip=" + ip + ", cpu=" + cpu + ", memory=" + memory + ", disk=" + disk + ", cpumax=" + cpumax + ", memorymax=" + memorymax + ", diskmax=" + diskmax + ", phone=" + phone + ", email=" + email + "]";
    }
}
