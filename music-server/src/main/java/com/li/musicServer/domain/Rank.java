package com.li.musicServer.domain;

import java.io.Serializable;

/**
 * @author SamLi
 * @version 1.0
 * @data 2024/2/22 - 10:32
 */
public class Rank implements Serializable {
    private Integer id;
    private Integer songListId;
    private Integer consumerId;
    private Integer score;

    public Rank(Integer id, Integer songListId, Integer consumerId, Integer score) {
        this.id = id;
        this.songListId = songListId;
        this.consumerId = consumerId;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSongListId() {
        return songListId;
    }

    public void setSongListId(Integer songListId) {
        this.songListId = songListId;
    }

    public Integer getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Integer consumerId) {
        this.consumerId = consumerId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
