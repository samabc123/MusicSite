package com.li.musicServer.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author SamLi
 * @version 1.0
 * @data 2024/2/22 - 10:36
 */
public class Singer implements Serializable {
    private Integer id;
    private String name;
    private Byte sex;
    private String pic;
    private Date birth;
    private String location;
    private String introduction;

    public Singer(Integer id, String name, Byte sex, String pic, Date birth, String location, String introduction) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.pic = pic;
        this.birth = birth;
        this.location = location;
        this.introduction = introduction;
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

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
