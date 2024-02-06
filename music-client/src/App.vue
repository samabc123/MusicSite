<template>
  <div id="app">
    <the-header/>
    <router-view class="music-content"/>
  </div>
</template>

<script>
import TheHeader from './components/TheHeader.vue';
export default {
  components:{
    TheHeader

  }
};
</script>

<style lang="scss" scoped>
@import './assets/css/app.scss';
</style>
