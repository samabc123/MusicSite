package com.li.musicServer.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author SamLi
 * @version 1.0
 * @data 2024/2/22 - 10:28
 */
public class Consumer implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private Byte sex;
    private String phoneNum;
    private String email;
    private Date birth;
    private String introduction;
    private String location;
    private String avator;
    private Date createTime;
    private Date updateTime;
    private Boolean isVipUser;

    public Consumer(Integer id, String username, String password, Byte sex, String phoneNum, String email, Date birth, String introduction, String location, String avator, Date createTime, Date updateTime, Boolean isVipUser) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.phoneNum = phoneNum;
        this.email = email;
        this.birth = birth;
        this.introduction = introduction;
        this.location = location;
        this.avator = avator;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.isVipUser = isVipUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getVipUser() {
        return isVipUser;
    }

    public void setVipUser(Boolean vipUser) {
        isVipUser = vipUser;
    }
}
