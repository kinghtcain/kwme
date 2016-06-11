package com.alphatheta.kw.services.impl;

import com.alphatheta.kw.daos.WebSitesDao;
import com.alphatheta.kw.entities.WebSites;
import com.alphatheta.kw.services.WebSitesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly=true)
@Service("webSitesService")
public class WebSitesServiceImpl implements WebSitesService {

    @Autowired
    private WebSitesDao webSitesDao;

    @Transactional
    public WebSites find(String id) {
        WebSites webSites = webSitesDao.find(id);
        return webSites;
    }

    @Transactional
    public List<WebSites> findAll() {
        List<WebSites> webSitesList = webSitesDao.findAll();
        return webSitesList;
    }

    @Transactional(readOnly = false)
    public String save(WebSites webSites) {
        String siteId = webSitesDao.save(webSites);
        return siteId;
    }

    @Transactional(readOnly = false)
    public String update(WebSites webSites) {
        String siteId = webSitesDao.update(webSites);
        return siteId;
    }

    /**
     * 还没实现
     * @param webSites
     * @return
     */
    @Transactional(readOnly = false)
    public String updateBySelect(WebSites webSites) {
        return null;
    }
}
