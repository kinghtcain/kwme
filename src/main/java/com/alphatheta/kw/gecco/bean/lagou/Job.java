package com.alphatheta.kw.gecco.bean.lagou;

import com.geccocrawler.gecco.annotation.*;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

import java.util.List;

/**
 * Created by zhangzhiquan on 2016/5/29.
 */
@Gecco(matchUrl = "http://www.lagou.com/jobs/{jobId}.html"/*,pipelines = { "consolePipeline",
        "persistPipeline" }*/)
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
    //这里面的链接有重复的数据，我们在获取这样的链接后应该自己处理，而不是交给gecco处理，
    //要不然重复的队列里面有重复的数据，会造成gecco报错，而且爬取到的数据也会有重复的
    @Href(click = true)
    @Attr("href")
    @HtmlField(cssPath=".similar_list_item a[href]")//加上Attr获取的是链接地址，加上Href可以再去抓取
    private List<String> similarJobLinks;
    //@Text
    //有些div没有class,这时候就会获取到空值
    @Html
    @HtmlField(cssPath="div.content_r dl.job_company dd div.work_addr,dl.job_company dd div:nth-child(0)")
    private String jobAddress;
    //职位发布者及其处理简历信息
    @Attr("class")
    @HtmlField(cssPath = ".jd_publisher div.publisher_name a[title]")
    private String jobPublisher;

    //简历及处理信息数据
    //1.简历及时处理率：投递后7天内处理完成的简历所占比例
    @Text
    @HtmlField(cssPath = ".publisher_data div:nth-child(1) span.data")
    private String resumeDealRate;
    @HtmlField(cssPath = ".publisher_data div:nth-child(1) span.tip")
    private String resumeDealRateTip;
    //2.简历处理用时:完成简历处理的平均用时
    @Text
    @HtmlField(cssPath = ".publisher_data div:nth-child(2) span.data")
    private String resumeDealTime;
    @HtmlField(cssPath = ".publisher_data div:nth-child(2) span.tip")
    private String resumeDealTimeTip;

    //公司信息
    @HtmlField(cssPath = ".job_company dt a div")
    private String companyName;
    @Attr("alt")
    @HtmlField(cssPath = ".job_company dt a img[alt]")
    private String companyFullName;
    //2.公司在拉勾上的页面
    @Href
    @HtmlField(cssPath = ".job_company dt a")
    private String compnayLagouPage;
    @Image(value = "src")
    @HtmlField(cssPath = ".job_company dt a img")
    private String titleImg;//公司在拉勾网上的图像

    @HtmlField(cssPath = "job_company dd ul.c_feature:nth-child(1) li:nth-child(1)")
    private String companyField;//公司所处领域
    @HtmlField(cssPath = "job_company dd ul.c_feature:nth-child(1) li:nth-child(2)")
    private String companyScale;//公司规模
    @Href
    @HtmlField(cssPath = "job_company dd ul.c_feature:nth-child(1) li:nth-child(3) a[href]")
    private String companyHomePage;//公司自身的主页
    @Html
    @HtmlField(cssPath = "job_company dd ul.c_feature:nth-child(2) li")
    private String companyDevStage;//公司发展阶段

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

    public String getJobPublisher() {
        return jobPublisher;
    }

    public void setJobPublisher(String jobPublisher) {
        this.jobPublisher = jobPublisher;
    }

    public String getResumeDealRateTip() {
        return resumeDealRateTip;
    }

    public void setResumeDealRateTip(String resumeDealRateTip) {
        this.resumeDealRateTip = resumeDealRateTip;
    }

    public String getResumeDealRate() {
        return resumeDealRate;
    }

    public void setResumeDealRate(String resumeDealRate) {
        this.resumeDealRate = resumeDealRate;
    }

    public String getResumeDealTime() {
        return resumeDealTime;
    }

    public void setResumeDealTime(String resumeDealTime) {
        this.resumeDealTime = resumeDealTime;
    }

    public String getResumeDealTimeTip() {
        return resumeDealTimeTip;
    }

    public void setResumeDealTimeTip(String resumeDealTimeTip) {
        this.resumeDealTimeTip = resumeDealTimeTip;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyFullName() {
        return companyFullName;
    }

    public void setCompanyFullName(String companyFullName) {
        this.companyFullName = companyFullName;
    }

    public String getCompnayLagouPage() {
        return compnayLagouPage;
    }

    public void setCompnayLagouPage(String compnayLagouPage) {
        this.compnayLagouPage = compnayLagouPage;
    }

    public String getTitleImg() {
        return titleImg;
    }

    public void setTitleImg(String titleImg) {
        this.titleImg = titleImg;
    }

    public String getCompanyField() {
        return companyField;
    }

    public void setCompanyField(String companyField) {
        this.companyField = companyField;
    }

    public String getCompanyScale() {
        return companyScale;
    }

    public void setCompanyScale(String companyScale) {
        this.companyScale = companyScale;
    }

    public String getCompanyHomePage() {
        return companyHomePage;
    }

    public void setCompanyHomePage(String companyHomePage) {
        this.companyHomePage = companyHomePage;
    }

    public String getCompanyDevStage() {
        return companyDevStage;
    }

    public void setCompanyDevStage(String companyDevStage) {
        this.companyDevStage = companyDevStage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        if (jobId != null ? !jobId.equals(job.jobId) : job.jobId != null) return false;
        if (jobOfferName != null ? !jobOfferName.equals(job.jobOfferName) : job.jobOfferName != null) return false;
        if (jobName != null ? !jobName.equals(job.jobName) : job.jobName != null) return false;
        if (jobRequest != null ? !jobRequest.equals(job.jobRequest) : job.jobRequest != null) return false;
        if (jobPayment != null ? !jobPayment.equals(job.jobPayment) : job.jobPayment != null) return false;
        if (jobPublishTime != null ? !jobPublishTime.equals(job.jobPublishTime) : job.jobPublishTime != null)
            return false;
        if (jobDescription != null ? !jobDescription.equals(job.jobDescription) : job.jobDescription != null)
            return false;
        if (similarJobLinks != null ? !similarJobLinks.equals(job.similarJobLinks) : job.similarJobLinks != null)
            return false;
        if (jobAddress != null ? !jobAddress.equals(job.jobAddress) : job.jobAddress != null) return false;
        if (jobPublisher != null ? !jobPublisher.equals(job.jobPublisher) : job.jobPublisher != null) return false;
        if (resumeDealRate != null ? !resumeDealRate.equals(job.resumeDealRate) : job.resumeDealRate != null)
            return false;
        if (resumeDealRateTip != null ? !resumeDealRateTip.equals(job.resumeDealRateTip) : job.resumeDealRateTip != null)
            return false;
        if (resumeDealTime != null ? !resumeDealTime.equals(job.resumeDealTime) : job.resumeDealTime != null)
            return false;
        if (resumeDealTimeTip != null ? !resumeDealTimeTip.equals(job.resumeDealTimeTip) : job.resumeDealTimeTip != null)
            return false;
        if (companyName != null ? !companyName.equals(job.companyName) : job.companyName != null) return false;
        if (companyFullName != null ? !companyFullName.equals(job.companyFullName) : job.companyFullName != null)
            return false;
        if (compnayLagouPage != null ? !compnayLagouPage.equals(job.compnayLagouPage) : job.compnayLagouPage != null)
            return false;
        if (titleImg != null ? !titleImg.equals(job.titleImg) : job.titleImg != null) return false;
        if (companyField != null ? !companyField.equals(job.companyField) : job.companyField != null) return false;
        if (companyScale != null ? !companyScale.equals(job.companyScale) : job.companyScale != null) return false;
        if (companyHomePage != null ? !companyHomePage.equals(job.companyHomePage) : job.companyHomePage != null)
            return false;
        return !(companyDevStage != null ? !companyDevStage.equals(job.companyDevStage) : job.companyDevStage != null);

    }

    @Override
    public int hashCode() {
        int result = jobId != null ? jobId.hashCode() : 0;
        result = 31 * result + (jobOfferName != null ? jobOfferName.hashCode() : 0);
        result = 31 * result + (jobName != null ? jobName.hashCode() : 0);
        result = 31 * result + (jobRequest != null ? jobRequest.hashCode() : 0);
        result = 31 * result + (jobPayment != null ? jobPayment.hashCode() : 0);
        result = 31 * result + (jobPublishTime != null ? jobPublishTime.hashCode() : 0);
        result = 31 * result + (jobDescription != null ? jobDescription.hashCode() : 0);
        result = 31 * result + (similarJobLinks != null ? similarJobLinks.hashCode() : 0);
        result = 31 * result + (jobAddress != null ? jobAddress.hashCode() : 0);
        result = 31 * result + (jobPublisher != null ? jobPublisher.hashCode() : 0);
        result = 31 * result + (resumeDealRate != null ? resumeDealRate.hashCode() : 0);
        result = 31 * result + (resumeDealRateTip != null ? resumeDealRateTip.hashCode() : 0);
        result = 31 * result + (resumeDealTime != null ? resumeDealTime.hashCode() : 0);
        result = 31 * result + (resumeDealTimeTip != null ? resumeDealTimeTip.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (companyFullName != null ? companyFullName.hashCode() : 0);
        result = 31 * result + (compnayLagouPage != null ? compnayLagouPage.hashCode() : 0);
        result = 31 * result + (titleImg != null ? titleImg.hashCode() : 0);
        result = 31 * result + (companyField != null ? companyField.hashCode() : 0);
        result = 31 * result + (companyScale != null ? companyScale.hashCode() : 0);
        result = 31 * result + (companyHomePage != null ? companyHomePage.hashCode() : 0);
        result = 31 * result + (companyDevStage != null ? companyDevStage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + jobId +
                ", jobOfferName='" + jobOfferName + '\'' +
                ", jobRequest='" + jobRequest + '\'' +
                ", jobName='" + jobName + '\'' +
                ", jobPayment='" + jobPayment + '\'' +
                ", jobPublishTime='" + jobPublishTime + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", similarJobLinks=" + similarJobLinks +
                ", jobAddress='" + jobAddress + '\'' +
                ", jobPublisher='" + jobPublisher + '\'' +
                ", resumeDealRate='" + resumeDealRate + '\'' +
                ", resumeDealRateTip='" + resumeDealRateTip + '\'' +
                ", resumeDealTime='" + resumeDealTime + '\'' +
                ", resumeDealTimeTip='" + resumeDealTimeTip + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyFullName='" + companyFullName + '\'' +
                ", compnayLagouPage='" + compnayLagouPage + '\'' +
                ", titleImg='" + titleImg + '\'' +
                ", companyField='" + companyField + '\'' +
                ", companyHomePage='" + companyHomePage + '\'' +
                ", companyScale='" + companyScale + '\'' +
                ", companyDevStage='" + companyDevStage + '\'' +
                '}';
    }
}
