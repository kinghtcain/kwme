package com.alphatheta.kw.services.impl;

import com.alphatheta.kw.services.WebSitesService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
@Service
public class WebSitesServiceImpl implements WebSitesService {
}
