package com.alphatheta.kw.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="kw_lagou_job")
@Entity
public class LagouJob {
    private String id;

    private Integer jobId;

    private String jobOfferName;

    private String jobName;

    private String jobRequest;

    private String jobPayment;

    private String jobPublishTime;

    private String jobAddress;

    private String jobDescription;

    public LagouJob(String id, Integer jobId, String jobOfferName, String jobRequest, String jobName, String jobPayment, String jobPublishTime, String jobAddress, String jobDescription) {
        this.id = id;
        this.jobId = jobId;
        this.jobOfferName = jobOfferName;
        this.jobRequest = jobRequest;
        this.jobName = jobName;
        this.jobPayment = jobPayment;
        this.jobPublishTime = jobPublishTime;
        this.jobAddress = jobAddress;
        this.jobDescription = jobDescription;
    }

    public LagouJob() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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
        this.jobOfferName = jobOfferName == null ? null : jobOfferName.trim();
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getJobRequest() {
        return jobRequest;
    }

    public void setJobRequest(String jobRequest) {
        this.jobRequest = jobRequest == null ? null : jobRequest.trim();
    }

    public String getJobPayment() {
        return jobPayment;
    }

    public void setJobPayment(String jobPayment) {
        this.jobPayment = jobPayment == null ? null : jobPayment.trim();
    }

    public String getJobPublishTime() {
        return jobPublishTime;
    }

    public void setJobPublishTime(String jobPublishTime) {
        this.jobPublishTime = jobPublishTime == null ? null : jobPublishTime.trim();
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress == null ? null : jobAddress.trim();
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription == null ? null : jobDescription.trim();
    }
}