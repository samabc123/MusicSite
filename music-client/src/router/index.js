import Vue from 'vue'
import VueRouter from 'vue-router'

import TheHome from '@/pages/TheHome'
import SongList from '@/pages/SongList'
import SingerList from '@/pages/SingerList'
import MyMusic from '@/pages/MyMusic'

Vue.use(VueRouter)

export default new VueRouter({
    routes: [
        {
            path: '/',
            name: 'TheHome',
            component: TheHome
        },
        {
            path: '/song-list',
            name: 'SongList',
            component: SongList
        },
        {
            path: '/singer-list',
            name: 'SingerList',
            component: SingerList
        },
        {
            path: '/my-music',
            name: 'MyMusice',
            component: MyMusic
        }
    ],
    scrollBehavior () {
        return { x: 0, y: 0 }
      }
})