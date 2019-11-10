package com.sda.adapter;

public class Display implements Data{
    public String parseData() {
        XMLData xml = new XMLData();
        return xml.xml();
    }
}
