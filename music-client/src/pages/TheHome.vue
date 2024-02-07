<template>
  <div class="home">
    <swiperList />
    <div class="section" v-for="(item, index) in songsList" :key="index">
      <div class="section-title">{{ item.name }}</div>
      <content-list :content-list="item.list"></content-list>
    </div>
  </div>
</template>

<script>
import swiperList from "../components/MySwiper.vue";
import { getAllSinger, getAllSongList } from "@/api/index";
import ContentList from '@/components/ContentList.vue';

export default {
  components: {
    swiperList,
    ContentList,
  },
  data() {
    return {
      songsList: [
        { name: "歌单", list: [] },
        { name: "歌手", list: [] },
      ],
    };
  },
  created() {
    this.getSongList()
    this.getSinger()
  },
  methods: {
    getSongList() {
      // 获取前10条歌单
      getAllSongList()
        .then((res) => {
          this.songsList[0].list = res.slice(0, 10);
        })
        .catch((err) => {
          console.log(err);
        });
    },
    getSinger() {
      // 获取前10名歌手
      getAllSinger()
        .then((res) => {
          this.songsList[1].list = res.slice(0, 10);
        })
        .catch((err) => {
          console.log(err);
        });
    },
  },
};
</script>

<style lang="scss" scoped>
@import '../assets/css/home.scss';
</style>