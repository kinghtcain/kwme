package com.alphatheta.kw.services;

import com.alphatheta.kw.entities.WebSites;

import java.util.List;

public interface WebSitesService {

    WebSites find(String id);
    List<WebSites> findAll();
    String save(WebSites webSites);
    String update(WebSites webSites);
    String updateBySelect(WebSites webSites);
}
