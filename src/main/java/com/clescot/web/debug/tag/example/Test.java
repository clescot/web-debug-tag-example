package com.clescot.web.debug.tag.example;

import com.google.common.collect.Maps;

import java.util.Map;

public class Test {



    private String dummyString = "a dummy string";
    private Map map = Maps.newHashMap();

    public Test() {
        map.put("name1","value1");
        map.put("name2","value2");
        map.put("name3",3);
    }
    public String getDummyString() {
        return dummyString;
    }

    public Map getMap() {
        return map;
    }
}
