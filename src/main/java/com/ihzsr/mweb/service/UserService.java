package com.ihzsr.mweb.service;

import com.ihzsr.mweb.bean.User;

public interface UserService
{
    User checkLogin(String userName, String userPassword);

    String register(User user);

    Integer queryCompanyId(String userName);

}
