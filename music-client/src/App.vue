<template>
  <div id="app">
    <the-header/>
    <router-view class="music-content"/>
    <the-footer/>
  </div>
</template>

<script>
import TheHeader from './components/TheHeader.vue';
import TheFooter from './components/TheFooter.vue';
export default {
  components:{
    TheHeader,
    TheFooter
  }
};
</script>

<style lang="scss" scoped>
@import './assets/css/app.scss';
</style>
