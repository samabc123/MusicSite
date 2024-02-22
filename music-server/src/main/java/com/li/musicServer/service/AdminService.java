package com.li.musicServer.service;

/**
 * @author SamLi
 * @version 1.0
 * @data 2024/2/22 - 10:46
 */
public interface AdminService {
    /**
     *验证密码是否正确
     */
    public boolean verifyPassword(String username,String password);
}
