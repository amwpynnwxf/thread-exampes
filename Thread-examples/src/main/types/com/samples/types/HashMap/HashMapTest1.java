package com.samples.types.HashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapTest1 {

	public static void main(String[] args) {
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("a", 111);
		
		Map<String, Object> t = new Hashtable<String, Object>();
		t.put("t", 222);
	}

}
