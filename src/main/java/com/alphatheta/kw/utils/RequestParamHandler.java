package com.alphatheta.kw.utils;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class RequestParamHandler {

    private RequestParamHandler(){
    }

    /**
     * 请求处理类，获取请求参数到一个map中
     * @param request web请求
     * @param args 表示查询参数，获取什么样的参数，是以可变的参数，如果有的话表示获取以这个参数开头的请求参数
     * @return
     */
    public static Map<String,Object> getQueryParams(HttpServletRequest request,String...args){

        return null;
    }
}
