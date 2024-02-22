package com.li.musicServer.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author SamLi
 * @version 1.0
 * @data 2024/2/22 - 9:31
 */
public class Collect implements Serializable {
    private Integer id;
    private Integer userId;
    private Integer type;
    private Integer songId;
    private Integer songListId;
    private Date createTime;

    public Collect(Integer id, Integer userId, Integer type, Integer songId, Integer songListId, Date createTime) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.songId = songId;
        this.songListId = songListId;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public Integer getSongListId() {
        return songListId;
    }

    public void setSongListId(Integer songListId) {
        this.songListId = songListId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
