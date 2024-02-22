package com.li.musicServer.domain;

import java.io.Serializable;

/**
 * @author SamLi
 * @version 1.0
 * @data 2024/2/22 - 9:24
 */
public class Admin implements Serializable {
    private Integer id;
    private String name;
    private String password;

    public Admin(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
