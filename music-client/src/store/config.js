const config = {
    state: {
        HOST: 'http://localhost:8080', // 后端访问地址
        activeName: ''                 // 当前选中的菜单
    },
    getters: {
        activeName: state => {
            let activeName = state.activeName
            if (!activeName) {
                activeName = JSON.parse(window.sessionStorage.getItem('activeName'))
            }
            return activeName
        }
    },
    mutations: {
        setActiveName: (state, activeName) => {
            state.activeName = activeName
            window.sessionStorage.setItem('activeName', JSON.stringify(activeName))
        }
    }
}

export default config
