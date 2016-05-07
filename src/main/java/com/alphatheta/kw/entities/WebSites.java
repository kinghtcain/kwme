package com.alphatheta.kw.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="kw_websites")
@Entity
public class WebSites {

    private String siteId;
    private String siteHomepage;
}
