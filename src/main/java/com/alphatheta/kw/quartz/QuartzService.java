package com.alphatheta.kw.quartz;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class QuartzService {

    @Autowired
    private SchedulerFactoryBean stdSchedulerFactory;

    /**
     * 删除任务
     * @param jobName
     * @param jobGroupName
     * @param triggerName
     * @param triggerGroupName
     * @throws SchedulerException
     */
    public void removeJob(String jobName,String jobGroupName,
                          String triggerName,String triggerGroupName)throws SchedulerException{
        Scheduler scheduler = stdSchedulerFactory.getScheduler();
        scheduler.pauseTrigger(triggerName,triggerGroupName);//暂停触发器;
        scheduler.unscheduleJob(triggerName,triggerGroupName);//移除触发器
        scheduler.deleteJob(jobName,jobGroupName);//删除任务
    }
}
