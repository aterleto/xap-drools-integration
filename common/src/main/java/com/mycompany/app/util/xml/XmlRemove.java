package com.mycompany.app.util.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("remove")
public class XmlRemove {

    @XStreamImplicit
    private List<XmlResource> resources;

    public List<XmlResource> getResources() {
        return resources;
    }

    public void setResources(List<XmlResource> resources) {
        this.resources = resources;
    }

}