package com.alphatheta.kw.gecco.pipeline;

import com.alphatheta.kw.gecco.bean.lagou.Company;
import com.geccocrawler.gecco.pipeline.Pipeline;
import org.springframework.stereotype.Service;

@Service("companyPersistPipeline")
public class CompanyPersistPipeline implements Pipeline<Company> {

    @Override
    public void process(Company company) {

    }
}
