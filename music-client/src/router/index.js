import Vue from 'vue'
import VueRouter from 'vue-router'

import TheHome from '@/pages/TheHome'

Vue.use(VueRouter)

export default new VueRouter({
    routes: [
        {
            path: '/',
            name: 'TheHome',
            component: TheHome
        }
    ]
})