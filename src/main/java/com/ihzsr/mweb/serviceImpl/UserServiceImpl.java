package com.ihzsr.mweb.serviceImpl;

import com.ihzsr.mweb.bean.User;
import com.ihzsr.mweb.dao.UserDao;
import com.ihzsr.mweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService
{

    @Autowired
    private UserDao userDao;
    
    public User checkLogin(String userName, String userPassword)
    {
        User user = userDao.queryByUserName(userName);
        if (user != null && user.getUserPassword().equals(userPassword))
        {
            return user;
        }
        return null;
    }

    @Override
    public String register(User user)
    {
        User u = userDao.queryByUserName(user.getUserName());
        if (u != null)
        {
            return "regFailed";
        }
        else
        {
            userDao.saveUserInfo(user);
            user.setUserId(userDao.queryUserId(user.getUserName()));
            userDao.saveCompanyInfo(user);
            return "regSuccess";
        }
    }

    @Override
    public Integer queryCompanyId(String userName)
    {
        return userDao.queryCompanyId(userName);
    }

}
