package com.alphatheta.kw.quartz;

import com.alphatheta.kw.entities.SiteStatus;
import com.alphatheta.kw.entities.WebSites;
import com.alphatheta.kw.services.SiteStatusService;
import com.alphatheta.kw.services.WebSitesService;
import jodd.http.HttpRequest;
import jodd.http.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class PageRequestQuartz {

    private static final Logger logger = LoggerFactory.getLogger(PageRequestQuartz.class);
    
    @Autowired
    private WebSitesService webSitesService;
    @Autowired
    private SiteStatusService siteStatusService;

    public void getStatus(){
        List<WebSites> sitesList = webSitesService.findAll();
        for (WebSites webSites : sitesList) {
            HttpRequest request = HttpRequest.get(webSites.getSiteHomepage());

            HttpResponse response = null;
            long begin = System.currentTimeMillis();
            Date reqDate = new Date();
            try {
                response = request.send();
            } catch (Exception e) {
                logger.error("请求异常："+e.getMessage()+",原因： "+ e.getCause());
            }
            long end = System.currentTimeMillis();
            int statusCode = response.statusCode();
            System.out.println(statusCode);
            String httpVersion = response.httpVersion();
            SiteStatus siteStatus = new SiteStatus(webSites.getSiteId(),statusCode,end-begin,reqDate);
            String siteId = siteStatusService.save(siteStatus);
        }
    }
}
