package com.alphatheta.kw.services.impl;

import com.alphatheta.kw.daos.LagouJobMapper;
import com.alphatheta.kw.entities.LagouJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by escience on 2016/5/29.
 */
@Service("lagouJobService")
@Transactional(readOnly = true)
public class LagouJobServiceImpl {

    @Autowired
    private LagouJobMapper lagouJobMapper;

    @Transactional(readOnly = false)
    public String save(LagouJob lagouJob){
        int insert = lagouJobMapper.insert(lagouJob);
        System.out.printf("insert : "+insert);
        return lagouJob.getId();
    }
}
