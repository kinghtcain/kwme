package com.alphatheta.kw.bean.lagou;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.annotation.Gecco;

/**
 * Created by escience on 2016/5/29.
 */
public class JobTest {

    public static void main(String[] args) {
        GeccoEngine.create().classpath("com.alphatheta.kw.gecco.bean.lagou")
                //.start("http://www.lagou.com/jobs/1319797.html")
                .start("http://www.lagou.com/jobs/1843450.html")
                .thread(5).interval(3000).loop(false)
                .debug(false).run();
    }
}
