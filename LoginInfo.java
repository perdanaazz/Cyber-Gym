/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gym;

/**
 *
 * @author ACER RYZEN 5
 */
public class LoginInfo {
    private String user;
    private String password;
    
    public void setLoginInfo(String getUser, String getPassword)
    {
        this.user = getUser;
        this.password = getPassword;
    }
    
    public void getLoginInfo(String getUser, String getPassword)
    {
        getUser = this.user;
        getPassword = this.password;
    }
    
}
