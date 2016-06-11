package com.alphatheta.kw.services.impl;

import com.alphatheta.kw.daos.SiteStatusDao;
import com.alphatheta.kw.entities.SiteStatus;
import com.alphatheta.kw.services.SiteStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service("siteStatusService")
public class SiteStatusServiceImpl implements SiteStatusService{

    @Autowired
    private SiteStatusDao siteStatusDao;

    @Transactional
    public SiteStatus find(String id) {
        return siteStatusDao.find(id);
    }

    @Transactional
    public List<SiteStatus> findAll() {
        return siteStatusDao.findAll();
    }

    @Transactional(readOnly = false)
    public String save(SiteStatus siteStatus) {
        siteStatusDao.save(siteStatus);
        return siteStatus.getSiteId();
    }

    @Transactional(readOnly = false)
    public String update(SiteStatus siteStatus) {
        siteStatusDao.update(siteStatus);
        return siteStatus.getSiteId();
    }
}
