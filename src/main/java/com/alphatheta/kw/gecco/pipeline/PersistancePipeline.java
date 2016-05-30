package com.alphatheta.kw.gecco.pipeline;

import com.alphatheta.kw.entities.LagouJob;
import com.alphatheta.kw.entities.LagouJobSimilarLinks;
import com.alphatheta.kw.gecco.bean.lagou.Job;
import com.alphatheta.kw.services.LagouJobService;
import com.alphatheta.kw.services.LagouJobSimilarLinksService;
import com.geccocrawler.gecco.pipeline.Pipeline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 *
 * Created by zhangzhiquan on 2016/5/29.
 */
@Service("persistPipeline")
public class PersistancePipeline implements Pipeline<Job> {

    @Autowired
    private LagouJobService lagouJobService;
    @Autowired
    private LagouJobSimilarLinksService lagouJobSimilarLinksService;


    @Override
    public void process(Job job) {
        //先保存主job
        String uuid2 = UUID.randomUUID().toString().replaceAll("-", "");
        LagouJob lagouJob = new LagouJob();
        lagouJob.setJobAddress(job.getJobAddress());
        lagouJob.setJobId(job.getJobId());
        lagouJob.setId(uuid2);
        lagouJob.setJobDescription(job.getJobDescription());
        lagouJob.setJobName(job.getJobName());
        lagouJob.setJobOfferName(job.getJobOfferName());
        lagouJob.setJobPayment(job.getJobPayment());
        lagouJob.setJobPublishTime(job.getJobPublishTime());
        lagouJob.setJobRequest(job.getJobRequest());
        String save = lagouJobService.save(lagouJob);
        System.out.printf("save return " + save);
        //再去保存link的job信息
        List<String> similarJobLinks = job.getSimilarJobLinks();
        for (int i = 0; i < similarJobLinks.size(); i++) {
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            LagouJobSimilarLinks slinks = new LagouJobSimilarLinks();
            slinks.setId(uuid);
            slinks.setLink(similarJobLinks.get(i));
            slinks.setSourceJobId(lagouJob.getId());
            String save1 = lagouJobSimilarLinksService.save(slinks);
            System.out.printf("save return " + save1);
        }
    }
    /*

     */
}
