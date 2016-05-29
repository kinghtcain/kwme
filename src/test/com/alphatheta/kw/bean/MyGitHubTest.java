package com.alphatheta.kw.bean;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.annotation.Gecco;

public class MyGitHubTest {

    public static void main(String[] args) {
        GeccoEngine.create()
                //搜索包的路径
                .classpath("com.alphatheta.kw.gecco.bean")
                //开始抓取的页面地址
                .start("https://github.com/xtuhcy/gecco")
                .start("https://github.com/xtuhcy/gecco-spring")
                .start("https://github.com/zw231212/kwme")
                //开启几个爬虫线程
                .thread(3)
                //单个爬虫每次抓取完一个请求后的间隔时间
                .interval(2000)
                .loop(true)
                .debug(false)
                .start();
    }
}
