import Vue from 'vue'
import App from './App.vue'
import Router from 'vue-router'

Vue.config.productionTip = false
Vue.use(Router);

new Vue({
  el: '#app',
  Router,
  components: { App },
  template: '<App/>'
})
