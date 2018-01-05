package com.edu.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.springframework.util.CollectionUtils;

public class App {
	public static void main(String[] args) {
//		List<String> names = new ArrayList<String>();
//		names.add("A");
//		names.add("B");
//		Iterator<String>  iterator = names.iterator();
//		while(iterator.hasNext()){
////			System.out.println(iterator.next());
//			names.add("c");
//			
//		}
		
		List<Integer> intergers = Arrays.asList(8, 7, 1,2,3);
		
		CustomArray<Integer> numbers = new CustomArray<Integer>(intergers);
		
		CustomIterator<Integer> cIt = numbers.getIte();
		while(cIt.hasNext()) {
			Integer ele = cIt.next();
			System.out.println(ele);
		}
		
	}
}
