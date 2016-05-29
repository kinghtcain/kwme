package com.alphatheta.kw.gecco.pipeline;

import com.alibaba.fastjson.JSON;
import com.alphatheta.kw.gecco.bean.lagou.Job;
import com.geccocrawler.gecco.pipeline.Pipeline;
import org.springframework.stereotype.Service;

@Service("consolePipeline")
public class MyConsolePipeline implements Pipeline<Job> {

    @Override
    public void process(Job job) {
        System.out.println(JSON.toJSONString(job));
        System.out.println("-------完美的分割线-----------");
    }
}
