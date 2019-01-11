package com.ihzsr.mweb.activemq;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ihzsr.mweb.bean.Messages;
import com.ihzsr.mweb.bean.Record;
import com.ihzsr.mweb.service.*;
import com.ihzsr.mweb.serviceImpl.MonitorDataServiceImpl;
import com.ihzsr.mweb.util.SendMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jms.*;

@Component("messageReceiverListener")
public class MessageReceiverListener implements MessageListener
{
    @Autowired
    private MessageService messageService;
    @Autowired
    private ProcessService processService;
    @Autowired
    private SettingsService settingsService;
    @Autowired
    private RecordService recordService;
    @Autowired
    private SendMail sendMail;
    @Autowired
    private MonitorDataServiceImpl monitorDataService;

    public void onMessage(Message m)
    {
        try
        {
            final TextMessage M = (TextMessage) m;
            final String messages = M.getText();
            JSONObject message = JSON.parseObject(messages);

            //信息
            JSONObject cpu = JSON.parseObject(message.getString("Cpu"));
            JSONObject memory = JSON.parseObject(message.getString("Memory"));
            JSONObject disk = JSON.parseObject(message.getString("Disk"));
            JSONObject system = JSON.parseObject(message.getString("System"));

            Messages Messages = new Messages();

            Messages.setCompanyCode(message.getString("Company_Code"));

            Messages.setCpuModel(cpu.getString("cpuModel"));
            Messages.setCpuNumber(Integer.valueOf(cpu.getString("cpuNumber")));
            Messages.setCpuCoreNumber(Integer.valueOf(cpu.getString("cpuCoreNumber")));
            Messages.setCpuUsageRate(Double.valueOf(cpu.getString("cpuUsageRate")));

            Messages.setMemoryUsageRate(Double.valueOf(memory.getString("memoryUsageRate")));
            Messages.setMemoryCapacity(Double.valueOf(memory.getString("memoryCapacity")));

            Messages.setDiskUsageRate(Double.valueOf(disk.getString("diskUsageRate").replace("%","")));
            Messages.setDiskCapacity(Double.valueOf(disk.getString("diskCapacity").replace("G","")));

            Messages.setServerRuntime(system.getString("serverRuntime"));
            Messages.setServerVersion(system.getString("serverVersion"));
            Messages.setIntranetIP(system.getString("ipAddress"));
            Messages.setLoadAverage(system.getString("loadAverage"));

            //messageService.add(Messages);
            System.out.println(Messages);
            monitorDataService.add(Messages);
            
            //HostBean hostBean=new HostBean();
            //MonitorDataBean monitorDataBean=new MonitorDataBean();
            
            

            //告警设置
           /* Settings settings = settingsService.queryAllSettings(system.getString("ipAddress"), message.getString("Company_Code"));

            if ((Double.valueOf(cpu.getString("cpuUsageRate")).intValue() >= Integer.parseInt(settings.getCpumax())) && settings.getCpu().equals("on"))
            {
                addRecord(message.getString("Company_Code"), system.getString("ipAddress"), "CPU使用率", new DecimalFormat("0.00").format(Double.parseDouble(cpu.getString("cpuUsageRate"))) + "%");
                sendMail.sendMail(settings.getEmail(), "杭州思软服务器监控平台告警", "您好，您IP为：" + settings.getIp() + "的服务器，在" + DateFormat.getDateTimeInstance().format(new Date()) + "时，CPU使用率达到：" + new DecimalFormat("0.00").format(Double.parseDouble(cpu.getString("cpuUsageRate"))) + "%，特此提示！");
            }
            if (Double.valueOf(memory.getString("memoryUsageRate")).intValue() >= Integer.parseInt(settings.getMemorymax()) && settings.getMemory().equals("on"))
            {
                addRecord(message.getString("Company_Code"), system.getString("ipAddress"), "内存使用率", new DecimalFormat("0.00").format(Double.parseDouble(cpu.getString("memoryUsageRate"))) + "%");
                sendMail.sendMail(settings.getEmail(), "杭州思软服务器监控平台告警", "您好，您IP为：" + settings.getIp() + "的服务器，在" + DateFormat.getDateTimeInstance().format(new Date()) + "时，内存使用率达到：" + new DecimalFormat("0.00").format(Double.parseDouble(memory.getString("memoryUsageRate"))) + "%，特此提示！");
            }
            if (Integer.parseInt(disk.getString("diskUsageRate").replace("%", "")) >= Integer.parseInt(settings.getDiskmax()) && settings.getDisk().equals("on"))
            {
                addRecord(message.getString("Company_Code"), system.getString("ipAddress"), "磁盘使用率", disk.getString("diskUsageRate"));
                sendMail.sendMail(settings.getEmail(), "杭州思软服务器监控平台告警", "您好，您IP为：" + settings.getIp() + "的服务器，在" + DateFormat.getDateTimeInstance().format(new Date()) + "时，磁盘使用率达到：" + disk.getString("diskUsageRate") + "，特此提示！");
            }*/

            //进程
            /*String process = message.getString("Process").replaceAll("\"\\{", "\\{").replaceAll("\\}\"", "\\}").replaceAll("\\\\", "");
            List<Process> procezz = JSON.parseArray(process, Process.class);
            processService.deleteProcess(system.getString("ipAddress"), message.getString("Company_Code"));
            for (Process processs : procezz)
            {
                processs.setIp(system.getString("ipAddress"));
                processs.setCompanyCode(message.getString("Company_Code"));
                processService.addProcess(processs);
            }*/

        } catch (final JMSException e)
        {
            e.printStackTrace();
        }
    }

    public void addRecord(String companyCode, String ip, String type, String text)
    {
        Record record = new Record();
        record.setCompanyCode(companyCode);
        record.setIp(ip);
        record.setType(type);
        record.setText(text);
        recordService.add(record);
    }
}