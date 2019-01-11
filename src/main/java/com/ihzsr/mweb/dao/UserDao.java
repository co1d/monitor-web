package com.ihzsr.mweb.dao;


import com.ihzsr.mweb.bean.User;

public interface UserDao {
	
    User queryByUserName(String userName);
    
    void saveUserInfo(User user);
    
    Integer queryUserId(String userName);
    
    void saveCompanyInfo(User user);
    
    Integer queryCompanyId(String userName);
    
}