import Vue from 'vue'
import VueRouter from 'vue-router'

import TheHome from '@/pages/TheHome'
import SongList from '@/pages/SongList'
import SingerList from '@/pages/SingerList'
import MyMusic from '@/pages/MyMusic'

Vue.use(VueRouter)

// 获取原型对象push函数
const originalPush = VueRouter.prototype.push

// 获取原型对象replace函数
const originalReplace = VueRouter.prototype.replace

// 修改原型对象中的push函数
VueRouter.prototype.push = function push(location){
return originalPush.call(this , location).catch(err=>err)
}

// 修改原型对象中的replace函数
VueRouter.prototype.replace = function replace(location){
return originalReplace.call(this , location).catch(err=>err)
}

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