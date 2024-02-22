package com.li.musicServer.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author SamLi
 * @version 1.0
 * @data 2024/2/22 - 10:36
 */
public class Song implements Serializable {
    private Integer id;
    private Integer singerId;
    private String name;
    private String introduction;
    private Date createTime;
    private Date updateTime;
    private String pic;
    private String lyric;
    private String url;
    private String mvurl;
    private Integer nums;
    private Boolean isVip;

    public Song(Integer id, Integer singerId, String name, String introduction, Date createTime, Date updateTime, String pic, String lyric, String url, String mvurl, Integer nums, Boolean isVip) {
        this.id = id;
        this.singerId = singerId;
        this.name = name;
        this.introduction = introduction;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.pic = pic;
        this.lyric = lyric;
        this.url = url;
        this.mvurl = mvurl;
        this.nums = nums;
        this.isVip = isVip;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSingerId() {
        return singerId;
    }

    public void setSingerId(Integer singerId) {
        this.singerId = singerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMvurl() {
        return mvurl;
    }

    public void setMvurl(String mvurl) {
        this.mvurl = mvurl;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public Boolean getVip() {
        return isVip;
    }

    public void setVip(Boolean vip) {
        isVip = vip;
    }
}

