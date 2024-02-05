const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true
})
module.exports = {
  // 开发服务器
  devServer: {
    port: 8081, // 修改启动端口号
    proxy: {
      '/user': { // 请求相对路径以 /user 开头的，才会走这里的配置
        target: 'http://1.12.254.80:8080', // 这个就是后端地址
        changeOrigin: true,
        pathRewrite: {
          '^/user': ''
        }
      }
    }
  },
  publicPath: './'
}