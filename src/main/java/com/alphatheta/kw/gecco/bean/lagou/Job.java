package com.alphatheta.kw.gecco.bean.lagou;

import com.geccocrawler.gecco.annotation.*;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

import java.util.List;

/**
 * Created by escience on 2016/5/29.
 */
@Gecco(matchUrl = "http://www.lagou.com/jobs/{jobId}.html",pipelines = { "consolePipeline",
        "persistPipeline" })
public class Job implements HtmlBean{

    private static final long serialVersionUID = -377053120283382723L;

    @Request
    private HttpRequest request;

    @RequestParameter("jobId")
    private Integer jobId;
    @Text
    @HtmlField(cssPath=".join_tc_icon h1 div")
    private String jobOfferName;
    @Text
    @HtmlField(cssPath=".join_tc_icon h1[title]")
    private String jobName;
    @Html
    @HtmlField(cssPath=".job_request")
    private String jobRequest;
    @Text
    @HtmlField(cssPath=".job_request p:nth-child(1) span.red")
    private String jobPayment;
    @Text
    @HtmlField(cssPath=".job_request p:nth-child(3)")
    private String jobPublishTime;
    @Html
    @HtmlField(cssPath = ".job_detail dd.job_bt")
    private String jobDescription;
    //@Href(value = ".position_link")
    //@HtmlField(cssPath=".similar_list_item a.position_link")//获取的是全部简介信息
    /*
    "<div class=\"similar_list_item_logo\"> \n <img src=\"http://www.lagou.com/image1/M00/43/DD/CgYXBlXS_-iASe7RAAAHygPNQPI809.png?cc=0.8934424857143313\" alt=\"京东－大数据部\" width=\"56\" height=\"56\"> \n</div> \n<div class=\"similar_list_item_pos\"> \n <h2 title=\"Java高级开发工程师\">Java高级开发工程师</h2> \n <p>30k-60k</p> \n <p class=\"similar_company_name\"><span class=\"similar_company_name_span\">京东－大数据部 </span> <span>[北京·大屯]</span> </p> \n</div>"
     */
    //@Text
    @Href(click = true)
    @Attr("href")
    @HtmlField(cssPath=".similar_list_item a[href]")//加上Attr获取的是链接地址，加上Href可以再去抓取
    private List<String> similarJobLinks;
    //@Text
    //有些div没有class,这时候就会获取到空值
    @Html
    @HtmlField(cssPath="div.content_r dl.job_company dd div.work_addr,dl.job_company dd div:nth-child(0)")
    private String jobAddress;
    public HttpRequest getRequest() {
        return request;
    }
    public void setRequest(HttpRequest request) {
        this.request = request;
    }
    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobOfferName() {
        return jobOfferName;
    }

    public void setJobOfferName(String jobOfferName) {
        this.jobOfferName = jobOfferName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobRequest() {
        return jobRequest;
    }

    public void setJobRequest(String jobRequest) {
        this.jobRequest = jobRequest;
    }

    public String getJobPayment() {
        return jobPayment;
    }

    public void setJobPayment(String jobPayment) {
        this.jobPayment = jobPayment;
    }

    public String getJobPublishTime() {
        return jobPublishTime;
    }

    public void setJobPublishTime(String jobPublishTime) {
        this.jobPublishTime = jobPublishTime;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress;
    }
    public List<String> getSimilarJobLinks() {
        return similarJobLinks;
    }

    public void setSimilarJobLinks(List<String> similarJobLinks) {
        this.similarJobLinks = similarJobLinks;
    }
    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + jobId +
                ", jobOfferName='" + jobOfferName + '\'' +
                ", jobName='" + jobName + '\'' +
                ", jobRequest='" + jobRequest + '\'' +
                ", jobPayment='" + jobPayment + '\'' +
                ", jobPublishTimeAndSite='" + jobPublishTime + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", jobAddress='" + jobAddress + '\'' +
                '}';
    }
}
