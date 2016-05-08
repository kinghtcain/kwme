/**
 * Created by zhangzhiquan on 2016/5/8.
 */
//webpack配置文件
var webpack = require("webpack");
module.exports = {
    entry:"./app.js",
    /*
    "./app.js",//entry可以是个字符串或数组或者是对象。当entry是个字符串的时候，用来定义入口文件
     当entry是个数组的时候，里面同样包含入口js文件，另外一个参数可以是用来配置webpack提供的一个静态资源服务器，webpack-dev-server。webpack-dev-server会监控项目中每一个文件的变化，实时的进行构建，并且自动刷新页面
    */
    output:{
        path:"./build",
        filename:"kwme.js"
    },
    module:{
        loaders:[
            { test: /\.js$/, exclude: /node_modules/, loader: 'babel-loader'},
            { test: /\.css$/, loader: "style!css" },
            {test: /\.less/,loader: 'style-loader!css-loader!less-loader'}
        ]
    },
    resolve:{
        extensions:['','.js','.json']
    },
    watch:"true"
/*
 → 导航到目标网站目录
 → 输入npm命令安装Webpack DevServer
 npm install webpack-dev-server -g
 → 输入webpack-dev-server命令
 */
}