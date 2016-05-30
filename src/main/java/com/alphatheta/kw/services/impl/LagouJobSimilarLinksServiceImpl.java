package com.alphatheta.kw.services.impl;

import com.alphatheta.kw.daos.LagouJobSimilarLinksMapper;
import com.alphatheta.kw.entities.LagouJobSimilarLinks;
import com.alphatheta.kw.services.LagouJobSimilarLinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by escience on 2016/5/30.
 */
@Transactional(readOnly = true)
@Service("lagouJobSimilarLinksService")
public class LagouJobSimilarLinksServiceImpl implements LagouJobSimilarLinksService {

    @Autowired
    private LagouJobSimilarLinksMapper lagouJobSimilarLinksMapper;

    @Transactional(readOnly = false)
    public String save(LagouJobSimilarLinks lagouJobSimilarLinks) {
        int insert = lagouJobSimilarLinksMapper.insert(lagouJobSimilarLinks);
        System.out.printf("insert :" + insert);
        return lagouJobSimilarLinks.getId();
    }
}
