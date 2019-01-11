package com.ihzsr.mweb.util;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class LayuiModel implements Serializable
{
    private int code;
    private String msg;
    private List<?> data;
    private int count;

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public List<?> getData()
    {
        return data;
    }

    public void setData(List<?> data)
    {
        this.data = data;
        this.count = data.size();
    }

}
