package com.kyle.jacksondemo.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "industries")
public class ItemIndustryAndSubcategory extends ItemSubcategory {
    @JacksonXmlElementWrapper(localName = "subcategories")
    @JacksonXmlProperty(localName = "subcategory")
    private List<ItemSubcategory> subcategories;

    public List<ItemSubcategory> getSubcategories() {
        return subcategories;
    }
    public void setSubcategories(List<ItemSubcategory> subcategories) {
        this.subcategories = subcategories;
    }
}
