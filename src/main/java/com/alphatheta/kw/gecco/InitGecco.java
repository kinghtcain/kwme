package com.alphatheta.kw.gecco;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.spring.SpringGeccoEngine;
import org.springframework.stereotype.Service;

/**
 * Created by escience on 2016/5/29.
 */
@Service
public class InitGecco extends SpringGeccoEngine {

        @Override
        public void init() {
            GeccoEngine.create()
                    .pipelineFactory(springPipelineFactory)
                    .classpath("com.alphatheta.kw.gecco.bean.lagou")
                    .start("http://www.lagou.com/jobs/1843450.html")
                    .interval(5000)
                    .start();
        }
}
