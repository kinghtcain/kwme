package com.alphatheta.kw.daos;

import com.alphatheta.kw.entities.WebSites;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface WebSitesDao{

    WebSites find(String id);
    List<WebSites> findAll();
    String save(WebSites webSites);
    String update(WebSites webSites);
    //String updateBySelect(WebSites webSites);
}
