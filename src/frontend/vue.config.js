/*const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true
})
*/
const path = require('path')

module.exports = {

    // 빌드 위치
    outputDir: path.resolve(__dirname, "../main/resources/static"),
    devServer: {
        port: 8080,
        proxy: {
            '/api': {
                target: "http://localhost:8090",
                ws: true,
                changeOrigin: true
            }
        },
        headers: {
            'Access-Control-Allow-Origin': '*'
        }
    }

}