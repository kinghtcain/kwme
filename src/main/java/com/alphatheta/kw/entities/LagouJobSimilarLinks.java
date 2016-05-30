package com.alphatheta.kw.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="kw_lagou_job_similarlinks")
public class LagouJobSimilarLinks {
    private String id;

    private String sourceJobId;

    private String link;

    private String content;

    public LagouJobSimilarLinks() {
    }

    public LagouJobSimilarLinks(String id, String sourceJobId, String link, String content) {
        this.id = id;
        this.sourceJobId = sourceJobId;
        this.link = link;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSourceJobId() {
        return sourceJobId;
    }

    public void setSourceJobId(String sourceJobId) {
        this.sourceJobId = sourceJobId == null ? null : sourceJobId.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}