<template>
  <div class="content-list">
    <ul class="section-content">
      <li
        class="content-item"
        v-for="(item, index) in contentList"
        :key="index"
      >
        <div class="kuo">
          <img class="item-img" :src="attachImageUrl(item.pic)"/>
          <div class="mask">
            <svg class="icon">
              <use href="#icon-bofang"></use>
            </svg>
          </div>
        </div>
        <p class="item-name">{{ item.name || item.title }}</p>
      </li>
    </ul>
  </div>
</template>

<script>
import { mixin } from "../mixins";
export default {
  mixins: [mixin],
  props: ['contentList'],
};
</script>

<style lang="scss" scoped>
@import "../assets/css/content-list.scss";
</style>