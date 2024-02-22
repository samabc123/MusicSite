package com.li.musicServer.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author SamLi
 * @version 1.0
 * @data 2024/2/22 - 9:33
 */
public class Comment implements Serializable {
    private Integer id;
    private Integer userId;
    private Byte type;
    private Integer songId;
    private Integer songListId;
    private String content;
    private Date createTime;
    private Integer up;

    public Comment(Integer id, Integer userId, Byte type, Integer songId, Integer songListId, String content, Date createTime, Integer up) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.songId = songId;
        this.songListId = songListId;
        this.content = content;
        this.createTime = createTime;
        this.up = up;
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

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUp() {
        return up;
    }

    public void setUp(Integer up) {
        this.up = up;
    }
}
