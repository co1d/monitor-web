package com.ihzsr.mweb.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class History
{
    private long x;
    private double y;

    public long getX()
    {
        return x;
    }

    public void setX(String x)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date dt1;
        try
        {
            dt1 = sdf.parse(x);
            long ts1 = dt1.getTime();
            this.x = ts1;
        } catch (ParseException e)
        {
            e.printStackTrace();
        }
    }

    public double getY()
    {
        return y;
    }

    public void setY(String y)
    {
        this.y = Double.parseDouble(y);
    }

    @Override
    public String toString()
    {
        return "History [x=" + x + ", y=" + y + "]";
    }

}
