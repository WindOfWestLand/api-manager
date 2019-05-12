package com.sunshine.api.manager;

import java.util.List;

public class XmlField {

    private String name;
    private String type;
    private List<XmlField> child;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<XmlField> getChild() {
        return child;
    }

    public void setChild(List<XmlField> child) {
        this.child = child;
    }
}
