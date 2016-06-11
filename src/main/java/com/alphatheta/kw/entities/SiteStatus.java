package com.alphatheta.kw.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "kw_webstatus")
@Entity
public class SiteStatus {

    private String siteId;
    private Integer statusCode;
    private Long reqTime;
    private Date reqDate;

    public SiteStatus() {
    }

    public SiteStatus(String siteId, Integer statusCode, Long reqTime, Date reqDate) {
        this.siteId = siteId;
        this.statusCode = statusCode;
        this.reqTime = reqTime;
        this.reqDate = reqDate;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Long getReqTime() {
        return reqTime;
    }

    public void setReqTime(Long reqTime) {
        this.reqTime = reqTime;
    }

    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SiteStatus that = (SiteStatus) o;

        if (siteId != null ? !siteId.equals(that.siteId) : that.siteId != null) return false;
        if (statusCode != null ? !statusCode.equals(that.statusCode) : that.statusCode != null) return false;
        if (reqTime != null ? !reqTime.equals(that.reqTime) : that.reqTime != null) return false;
        return !(reqDate != null ? !reqDate.equals(that.reqDate) : that.reqDate != null);

    }

    @Override
    public int hashCode() {
        int result = siteId != null ? siteId.hashCode() : 0;
        result = 31 * result + (statusCode != null ? statusCode.hashCode() : 0);
        result = 31 * result + (reqTime != null ? reqTime.hashCode() : 0);
        result = 31 * result + (reqDate != null ? reqDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SiteStatus{" +
                "siteId='" + siteId + '\'' +
                ", statusCode=" + statusCode +
                ", reqTime=" + reqTime +
                ", reqDate=" + reqDate +
                '}';
    }
}
