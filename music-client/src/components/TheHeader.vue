<template>
  <div class="the-header">
    <div class="header-logo" @click="gohome">
      <svg class="icon">
        <use href="#icon-erji"></use>
      </svg>
      <span>Music</span>
    </div>
    <ul class="navbar">
      <li :class="{ active : item.name === activeName}" v-for="item in navMsg" :key="item.path"
      @click="goPage(item.path, item.name)">
        {{ item.name }}
      </li>
      <li></li>
      <li></li>
    </ul>
  </div>
</template>

<script>
import {mapGetters} from 'vuex'
import {navMsg} from '../assets/data/header'
export default {
  data() {
    return {
      navMsg: [],    //左侧导航栏
      keywords: '',  //搜索关键字
      loginMsg: [],  //右侧导航栏
      menuList: [], //用户下拉菜单
    }
  },
  computed: {
    ...mapGetters([
      'activeName',
    ])
  },
  created () {
    this.navMsg = navMsg
  },
  methods: {
    gohome() {
      this.$router.push({path:'/'})
    },
    goPage(path, name) {
      this.$store.commit('setActiveName', name)
      this.$router.push({path: path})
    }
  }
}
</script>

<style lang="scss" scoped>
@import '../assets/css/the-header.scss';
</style>