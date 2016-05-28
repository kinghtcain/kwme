package com.alphatheta.kw.bean;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.annotation.Gecco;

public class MyGitHubTest {

    public static void main(String[] args) {
        GeccoEngine.create()
                //搜索包的路径
                .classpath("com.alphatheta.kw.geccobean")
                //开始抓取的页面地址
                .start("https://github.com/xtuhcy/gecco")
                //开启几个爬虫线程
                .thread(1)
                //单个爬虫每次抓取完一个请求后的间隔时间
                .interval(2000)
                .debug(true)
                .start();
    }
}
