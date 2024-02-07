export const mixin = {
    //获取图片地址
    attachImageUrl(srcUrl) {
        return srcUrl ? this.$store.state.config.HOST + srcUrl : '../assets/img/user.jpg'
    }
}