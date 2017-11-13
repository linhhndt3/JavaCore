package com.edu.linhhn.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTut {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String a : args) {
			Integer count = map.get(a);
			map.put(a, count == null ? 0 : ++count); 
		}
		
		List<List<String>> multiMap = new ArrayList<List<String>>();
		
		Collections.sort(multiMap, new Comparator<List<String>>() {

			@Override
			public int compare(List<String> l1, List<String> l2) {
				// TODO Auto-generated method stub
				return l1.size() - l2.size();
			}
		
		});
	}
}
