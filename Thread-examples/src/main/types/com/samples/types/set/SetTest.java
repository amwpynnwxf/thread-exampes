package com.samples.types.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author HLH
 */
public class SetTest {
    public static void main(String[] args) {
        Sample s1 = new Sample("是说");
        Sample s2 = new Sample("是是是");

        Set set = new HashSet();
        set.add(s1);
        set.add(s2);
        set.add(1);
        set.add("ss");
        set.add(set);
        System.out.println(set);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("a", "a");
        map.put("b", s1);
        System.out.println(map);
    }
}

class Sample{
    private String name;

    public Sample(String name) {
        this.name = name;
    }
}
