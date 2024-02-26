import vue from 'vue'
import VueRouter from 'vue-router'

import MyLogin from '../pages/MyLogin.vue'

vue.use(VueRouter)

export default new VueRouter({
    routes: [
        {
            path: '/',
            component: MyLogin
        },
    ],
    mode: 'history'
})
