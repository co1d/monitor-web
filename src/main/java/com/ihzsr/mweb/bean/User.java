package com.ihzsr.mweb.bean;

public class User
{
    private Integer userId;
    private String userName;
    private String userPassword;
    private String companyName;
    private String companyCode;

    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = (userName == null ? null : userName.trim());
    }

    public String getUserPassword()
    {
        return userPassword;
    }

    public void setUserPassword(String userPassword)
    {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public String getCompanyCode()
    {
        return companyCode;
    }

    public void setCompanyCode(String companyCode)
    {
        this.companyCode = companyCode;
    }

    @Override
    public String toString()
    {
        return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", companyName=" + companyName + ", companyCode=" + companyCode + "]";
    }

}