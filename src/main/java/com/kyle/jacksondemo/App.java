package com.kyle.jacksondemo;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.kyle.jacksondemo.pojo.ItemIndustryAndSubcategory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    /**
     * jackson学习
     * 参考：https://blog.csdn.net/u014746965/article/details/78647616
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // String xml = "<root><industries><id>CE</id><name>Consumer Electronics</name><subcategories><subcategory><id>532</id><name>HD-DVD Players</name></subcategory></subcategories></industries><industries><id>CH</id><name>Computer Hardware</name><subcategories><subcategory><id>522</id><name>Memory (USB Flash Drive)</name></subcategory></subcategories></industries></root>";

        //String xml = "<industries><industry><id>CE</id><name>Consumer Electronics</name><subcategories><subcategory><id>532</id><name>HD-DVD Players</name></subcategory></subcategories></industry><industry><id>CH</id><name>Computer Hardware</name><subcategories><subcategory><id>522</id><name>Memory (USB Flash Drive)</name></subcategory></subcategories></industry></industries>";

        String xml = "<industries><industry><id>CE</id><name>Consumer Electronics</name><subcategories><subcategory><id>532</id><name>HD-DVD Players</name></subcategory><subcategory><id>532</id><name>HD-DVD Players</name></subcategory></subcategories></industry><industry><id>CH</id><name>Computer Hardware</name><subcategories><subcategory><id>522</id><name>Memory (USB Flash Drive)</name></subcategory><subcategory><id>522</id><name>Memory (USB Flash Drive)</name></subcategory></subcategories></industry></industries>";

        XmlMapper xmlMapper = new XmlMapper();

        JavaType javaType = xmlMapper.getTypeFactory().constructParametricType(ArrayList.class, ItemIndustryAndSubcategory.class);

        List<ItemIndustryAndSubcategory> industryAndSubcategories = xmlMapper.readValue(xml, javaType);
    }
}
