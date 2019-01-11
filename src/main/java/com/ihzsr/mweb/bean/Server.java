package com.ihzsr.mweb.bean;

public class Server
{

    private Integer companyId;
    private Integer serverIp;
    private String title;
    private String serverLocation;
    private String serverPrincipal;
    private String principalPhone;
    private String serverDescription;


    public Integer getCompanyId()
    {
        return companyId;
    }

    public void setCompanyId(Integer companyId)
    {
        this.companyId = companyId;
    }

    public Integer getServerIp()
    {
        return serverIp;
    }

    public void setServerIp(Integer serverIp)
    {
        this.serverIp = serverIp;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getServerLocation()
    {
        return serverLocation;
    }

    public void setServerLocation(String serverLocation)
    {
        this.serverLocation = serverLocation;
    }

    public String getServerPrincipal()
    {
        return serverPrincipal;
    }

    public void setServerPrincipal(String serverPrincipal)
    {
        this.serverPrincipal = serverPrincipal;
    }

    public String getPrincipalPhone()
    {
        return principalPhone;
    }

    public void setPrincipalPhone(String principalPhone)
    {
        this.principalPhone = principalPhone;
    }

    public String getServerDescription()
    {
        return serverDescription;
    }

    public void setServerDescription(String serverDescription)
    {
        this.serverDescription = serverDescription;
    }
    

    @Override
    public String toString()
    {
        return "Server [companyId=" + companyId + ", serverIp=" + serverIp +
                ", title=" + title + ", serverLocation=" + serverLocation + 
                ", serverPrincipal=" + serverPrincipal + ", principalPhone=" + principalPhone + 
                ", serverDescription=" + serverDescription  + "]";
    }
}
