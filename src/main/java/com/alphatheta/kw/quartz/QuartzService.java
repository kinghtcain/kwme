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

}
