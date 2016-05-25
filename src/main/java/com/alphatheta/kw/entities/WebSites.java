package com.alphatheta.kw.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="kw_websites")
@Entity
public class WebSites {

    private String siteId;
    private String siteHomepage;
    public WebSites() {
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSiteHomepage() {
        return siteHomepage;
    }

    public void setSiteHomepage(String siteHomepage) {
        this.siteHomepage = siteHomepage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WebSites webSites = (WebSites) o;

        if (siteId != null ? !siteId.equals(webSites.siteId) : webSites.siteId != null) return false;
        return !(siteHomepage != null ? !siteHomepage.equals(webSites.siteHomepage) : webSites.siteHomepage != null);

    }

    @Override
    public int hashCode() {
        int result = siteId != null ? siteId.hashCode() : 0;
        result = 31 * result + (siteHomepage != null ? siteHomepage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "WebSites{" +
                "siteId='" + siteId + '\'' +
                ", siteHomepage='" + siteHomepage + '\'' +
                '}';
    }
}
