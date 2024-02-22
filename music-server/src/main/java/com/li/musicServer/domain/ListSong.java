package com.li.musicServer.domain;

import java.io.Serializable;

/**
 * @author SamLi
 * @version 1.0
 * @data 2024/2/22 - 10:31
 */
public class ListSong implements Serializable {
    private Integer id;     //主键

    private Integer songId; //歌曲id

    private Integer songListId; //歌单id

    public ListSong(Integer id, Integer songId, Integer songListId) {
        this.id = id;
        this.songId = songId;
        this.songListId = songListId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
