package com.li.musicServer.service.impl;

import com.li.musicServer.dao.AdminMapper;
import com.li.musicServer.service.AdminService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author SamLi
 * @version 1.0
 * @data 2024/2/22 - 10:48
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;
    /**
     * 验证密码是否正确
     */
    @Override
    public boolean verifyPassword(String username, String password) {
        return adminMapper.verifyPassword(username,password)>0;
    }
}
