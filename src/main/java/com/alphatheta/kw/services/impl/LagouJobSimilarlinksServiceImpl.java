package com.alphatheta.kw.services.impl;

import com.alphatheta.kw.daos.LagouJobSimilarLinksMapper;
import com.alphatheta.kw.entities.LagouJob;
import com.alphatheta.kw.entities.LagouJobSimilarLinks;
import com.alphatheta.kw.services.LagouJobSimilarlinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by escience on 2016/5/29.
 */
@Transactional(readOnly = true)
@Service("lagouJobSimilarlinks")
public class LagouJobSimilarlinksServiceImpl {

    @Autowired
    private LagouJobSimilarLinksMapper lagouJobSimilarLinksMapper;

    @Transactional(readOnly = false)
    public String save(LagouJobSimilarLinks lagouJobSimilarlinks){
        int insert = lagouJobSimilarLinksMapper.insert(lagouJobSimilarlinks);
        System.out.printf("insert : "+insert);
        return lagouJobSimilarlinks.getId();
    }
}
