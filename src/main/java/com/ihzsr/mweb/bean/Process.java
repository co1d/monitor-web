package com.ihzsr.mweb.bean;

public class Process
{
    private String companyCode;
    private String ip;
    private String procezzUSER;
    private String procezzPID;
    private String procezzCPU;
    private String procezzMEM;
    private String procezzRSS;
    private String procezzSTARTED;
    private String procezzTIME;
    private String procezzCOMMAND;

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

    public String getProcezzUSER()
    {
        return procezzUSER;
    }

    public void setProcezzUSER(String procezzUSER)
    {
        this.procezzUSER = procezzUSER;
    }

    public String getProcezzPID()
    {
        return procezzPID;
    }

    public void setProcezzPID(String procezzPID)
    {
        this.procezzPID = procezzPID;
    }

    public String getProcezzCPU()
    {
        return procezzCPU;
    }

    public void setProcezzCPU(String procezzCPU)
    {
        this.procezzCPU = procezzCPU;
    }

    public String getProcezzMEM()
    {
        return procezzMEM;
    }

    public void setProcezzMEM(String procezzMEM)
    {
        this.procezzMEM = procezzMEM;
    }

    public String getProcezzRSS()
    {
        return procezzRSS;
    }

    public void setProcezzRSS(String procezzRSS)
    {
        this.procezzRSS = procezzRSS;
    }

    public String getProcezzSTARTED()
    {
        return procezzSTARTED;
    }

    public void setProcezzSTARTED(String procezzSTARTED)
    {
        this.procezzSTARTED = procezzSTARTED;
    }

    public String getProcezzTIME()
    {
        return procezzTIME;
    }

    public void setProcezzTIME(String procezzTIME)
    {
        this.procezzTIME = procezzTIME;
    }

    public String getProcezzCOMMAND()
    {
        return procezzCOMMAND;
    }

    public void setProcezzCOMMAND(String procezzCOMMAND)
    {
        this.procezzCOMMAND = procezzCOMMAND;
    }

    @Override
    public String toString()
    {
        return "Process [companyCode=" + companyCode + ", ip=" + ip + ", procezzUSER=" + procezzUSER + ", procezzPID=" + procezzPID + ", procezzCPU=" + procezzCPU + ", procezzMEM=" + procezzMEM + ", procezzRSS=" + procezzRSS + ", procezzSTARTED=" + procezzSTARTED + ", procezzTIME=" + procezzTIME + ", procezzCOMMAND=" + procezzCOMMAND + "]";
    }
}
