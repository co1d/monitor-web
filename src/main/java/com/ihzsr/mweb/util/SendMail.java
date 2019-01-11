package com.ihzsr.mweb.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Properties;

@RestController
public class SendMail
{
    @Autowired
    private JavaMailSender javaMailSender;

    public Object sendMail(String mail, String title, String text)
    {
        MimeMessage mMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mMessageHelper;
        Properties prop = new Properties();
        String from;
        try
        {
            prop.load(this.getClass().getResourceAsStream("/mail.properties"));
            from = prop.get("mail.smtp.username") + "";
            mMessageHelper = new MimeMessageHelper(mMessage, true);
            mMessageHelper.setFrom(from);
            mMessageHelper.setTo(mail);//收件人邮箱
            mMessageHelper.setSubject(title);//邮件的主题
            mMessageHelper.setText("<p>" + text + "</p><br/>", true);//邮件的文本内容
            javaMailSender.send(mMessage);
        } catch (MessagingException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return "发送成功";
    }
}
