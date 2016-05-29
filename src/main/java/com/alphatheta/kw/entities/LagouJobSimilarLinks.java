package com.alphatheta.kw.entities;

public class LagouJobSimilarLinks {
    private String id;

    private LagouJob sourceJob;

    private String link;

    private String content;

    public LagouJobSimilarLinks() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public LagouJob getSourceJob() {
        return sourceJob;
    }

    public void setSourceJob(LagouJob sourceJob) {
        this.sourceJob = sourceJob;
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