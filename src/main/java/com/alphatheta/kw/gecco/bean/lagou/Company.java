package com.alphatheta.kw.gecco.bean.lagou;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.GeccoClass;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

/**
 * Created by zhangzhiquan on 2016/6/1.
 */
@Gecco(matchUrl = "http://www.lagou.com/gongsi/{companyId}.html"/*,pipelines = {"consolePipeline",
"companyPersistPipeline"}*/)
public class Company implements HtmlBean{

    private static final long serialVersionUID = -377053120283382723L;

    @Request
    private HttpRequest request;

}
