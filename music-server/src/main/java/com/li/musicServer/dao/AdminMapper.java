package com.li.musicServer.dao;

import org.springframework.stereotype.Repository;

/**
 * @author SamLi
 * @version 1.0
 * @data 2024/2/22 - 10:39
 */
@Repository
public interface AdminMapper {
    /**
     *验证密码是否正确
     */
    public int verifyPassword(String username,String password);
}
