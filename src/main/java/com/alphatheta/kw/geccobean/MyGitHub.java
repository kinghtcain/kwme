package com.alphatheta.kw.geccobean;

import com.geccocrawler.gecco.annotation.*;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl="https://github.com/{user}/{project}", pipelines="consolePipeline")
public class MyGitHub implements HtmlBean{

    private static final long serialVersionUID = -7127412585200687225L;

    @Request
    private HttpRequest request;

    @RequestParameter("user")
    private String user;
    @RequestParameter("project")
    private String project;
    @Html
    @HtmlField(cssPath=".repository-meta-content")
    private String title;
    @Text
    @HtmlField(cssPath=".pagehead-actions li:nth-child(2) .social-count")
    private int starNum;
    @Text
    @HtmlField(cssPath=".pagehead-actions li:nth-child(3) .social-count")
    private int forkNum;
    @Html
    @HtmlField(cssPath = ".entry-content")
    private String readMe;

    @Href
    @HtmlField(cssPath="ul.numbers-summary > li:nth-child(4) > a")
    private String contributors;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStarNum() {
        return starNum;
    }

    public void setStarNum(int starNum) {
        this.starNum = starNum;
    }

    public int getForkNum() {
        return forkNum;
    }

    public void setForkNum(int forkNum) {
        this.forkNum = forkNum;
    }

    public String getReadMe() {
        return readMe;
    }

    public void setReadMe(String readMe) {
        this.readMe = readMe;
    }

    public String getContributors() {
        return contributors;
    }
    public void setContributors(String contributors) {
        this.contributors = contributors;
    }

    public HttpRequest getRequest() {
        return request;
    }

    public void setRequest(HttpRequest request) {
        this.request = request;
    }
    /**
     * 代码说明：
     * 接口HtmlBean说明该爬虫是一个解析html页面的爬虫（gecco还支持json格式的解析）
     * 注解@Gecco告知该爬虫匹配的url格式（matchUrl)和内容抽取后的bean的处理类
     * （pepelines处理类采用管道过滤器模式，可以定义多个处理类）。
     * 注解@RequestParameter可以注入url中的请求参数，如：@RequestParameter("user")
     * 表示匹配url中的{user},
     * 注解@HtmlField表示抽取Html中的元素，cssPath采用类似jquery的css selector选取元素。
     * 注解@Text表示获取HtmlField抽取出来的元素的text内容
     * 注解@Html表示获取@HtmlField抽取出来的元素的html内容，如果不指定的话默认为@Html
     * GeccoEngine表示爬虫引擎，通过create进行初始化，通过start()/run()来运行，可以配置一些
     * 启动的参数，比如扫描@Gecco注解的包名为classpath，开始抓取的url地址的
     * start;抓取的线程数thread；抓取完一个页面
     */
}
