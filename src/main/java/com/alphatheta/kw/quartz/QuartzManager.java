package com.alphatheta.kw.quartz;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

import java.text.ParseException;

/**
 * 一个Quartz管理器
 * //http://www.open-open.com/lib/view/open1351324322285.html
 */
@Component
public class QuartzManager {

    //private static final Logger logger = LoggerFactory.getLogger(QuartzManager.class);

    @Autowired
    private static SchedulerFactoryBean stdSchedulerFactory;

    private static String JOB_GROUP_NAME = "SPRING_QUARTZ_JOB";
    private static String TRIGGER_GROUP_NAME = "SPRING_QUARTZ_TRIGGER";

    /**
     * 添加一个定时任务，使用默认的任务组名，触发器名，触发器组名
     *
     * @param jobName 任务名
     * @param clazz 任务
     * @param time 时间设置，参考quartz说明文档
     * @throws ParseException
     * @throws SchedulerException
     */
    public static void addJob(String jobName, Class clazz, String time)
            throws ParseException, SchedulerException {
        Scheduler scheduler = stdSchedulerFactory.getScheduler();
        JobDetail jobDetail = new JobDetail(jobName, JOB_GROUP_NAME, clazz);
        //触发器,触发器名，触发器组
        CronTrigger cronTrigger = new CronTrigger(jobName, TRIGGER_GROUP_NAME);
        cronTrigger.setCronExpression(time);
        scheduler.scheduleJob(jobDetail, cronTrigger);
        if (!scheduler.isShutdown()) {
            scheduler.start();
        }
    }

    /**
     * @param jobName          任务名
     * @param jobGroupName     任务组名
     * @param triggerName      触发器名
     * @param triggerGroupName 触发器组名
     * @param jobClass         任务
     * @param time             时间设置，参考quartz说明文档
     * @Description: 添加一个定时任务
     * @Title: QuartzManager.java
     */
    public static void addJob(String jobName, String jobGroupName,
                              String triggerName, String triggerGroupName, Class jobClass,
                              String time) throws ParseException, SchedulerException {
        Scheduler sched = stdSchedulerFactory.getScheduler();
        JobDetail jobDetail = new JobDetail(jobName, jobGroupName, jobClass);// 任务名，任务组，任务执行类
        // 触发器
        CronTrigger trigger = new CronTrigger(triggerName, triggerGroupName);// 触发器名,触发器组
        trigger.setCronExpression(time);// 触发器时间设定
        sched.scheduleJob(jobDetail, trigger);
    }

    /**
     * @param jobName
     * @param time
     * @Description: 修改一个任务的触发时间(使用默认的任务组名，触发器名，触发器组名)
     * @Title: QuartzManager.java
     */
    public static void modifyJobTime(String jobName, String time) throws ParseException, SchedulerException {
        Scheduler sched = stdSchedulerFactory.getScheduler();
        CronTrigger trigger = (CronTrigger) sched.getTrigger(jobName, TRIGGER_GROUP_NAME);
        if (trigger == null) {
            return;
        }
        String oldTime = trigger.getCronExpression();
        if (!oldTime.equalsIgnoreCase(time)) {
            JobDetail jobDetail = sched.getJobDetail(jobName, JOB_GROUP_NAME);
            Class objJobClass = jobDetail.getJobClass();
            removeJob(jobName);
            addJob(jobName, objJobClass, time);
        }
    }

    /**
     * @param triggerName
     * @param triggerGroupName
     * @param time
     * @Description: 修改一个任务的触发时间
     * @Title: QuartzManager.java
     */
    public static void modifyJobTime(String triggerName, String triggerGroupName, String time)
            throws ParseException, SchedulerException {
        Scheduler sched = stdSchedulerFactory.getScheduler();
        CronTrigger trigger = (CronTrigger) sched.getTrigger(triggerName, triggerGroupName);
        if (trigger == null) {
            return;
        }
        String oldTime = trigger.getCronExpression();
        if (!oldTime.equalsIgnoreCase(time)) {
            CronTrigger ct = (CronTrigger) trigger;
            // 修改时间
            ct.setCronExpression(time);
            // 重启触发器
            sched.resumeTrigger(triggerName, triggerGroupName);
        }
    }

    /**
     * @param jobName
     * @Description: 移除一个任务(使用默认的任务组名，触发器名，触发器组名)
     * @Title: QuartzManager.java
     */
    public static void removeJob(String jobName) throws SchedulerException {
        Scheduler sched = stdSchedulerFactory.getScheduler();
        sched.pauseTrigger(jobName, TRIGGER_GROUP_NAME);// 停止触发器
        sched.unscheduleJob(jobName, TRIGGER_GROUP_NAME);// 移除触发器
        sched.deleteJob(jobName, JOB_GROUP_NAME);// 删除任务
    }

    /**
     * @param jobName
     * @param jobGroupName
     * @param triggerName
     * @param triggerGroupName
     * @Description: 移除一个任务
     * @Title: QuartzManager.java
     */
    public static void removeJob(String jobName, String jobGroupName,
                                 String triggerName, String triggerGroupName) throws SchedulerException {
        Scheduler sched = stdSchedulerFactory.getScheduler();
        sched.pauseTrigger(triggerName, triggerGroupName);// 停止触发器
        sched.unscheduleJob(triggerName, triggerGroupName);// 移除触发器
        sched.deleteJob(jobName, jobGroupName);// 删除任务
    }

    /**
     * @Description:启动所有定时任务
     * @Title: QuartzManager.java
     */
    public static void startJobs() throws SchedulerException {
        Scheduler sched = stdSchedulerFactory.getScheduler();
        sched.start();
    }

    /**
     * @Description:关闭所有定时任务
     * @Title: QuartzManager.java
     */
    public static void shutdownJobs() throws SchedulerException {
        Scheduler sched = stdSchedulerFactory.getScheduler();
        if (!sched.isShutdown()) {
            sched.shutdown();
        }
    }


    //========================================================
    //http://www.dexcoder.com/selfly/article/311
    //得到计划中的任务
    //正在运行中的任务
    //暂停任务
    //恢复任务
    //删除任务
    //立即运行任务
    //更新任务的时间表达式

}
