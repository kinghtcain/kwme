package com.alphatheta.kw.daos;

import com.alphatheta.kw.entities.SiteStatus;

import java.util.List;

public interface SiteStatusDao {

    public void save(SiteStatus siteStatus);
    public void update(SiteStatus siteStatus);
    public SiteStatus find(String id);
    public List<SiteStatus> findAll();
}
