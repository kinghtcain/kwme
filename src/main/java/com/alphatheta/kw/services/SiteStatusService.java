package com.alphatheta.kw.services;

import com.alphatheta.kw.entities.SiteStatus;
import com.alphatheta.kw.entities.WebSites;

import java.util.List;

public interface SiteStatusService {

    SiteStatus find(String id);
    List<SiteStatus> findAll();
    String save(SiteStatus siteStatus);
    String update(SiteStatus siteStatus);
}
