package com.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Q2 {

	public static void main(String[] args) {

		String[] records = {
				"A,IT,1000", 
				"B,IT,1000", 
				"C,HR,1000", 
				"D,IT,1000", 
				"E,HR,1000",
				"A,IT,1000", 
				"B,IT,1000", 
				"C,HR,1000", 
				};
		
		
		//-------------------------------------------------

//		Map<String, Double> map = new HashMap<>();
//
//		for (String record : records) {
//			String[] tokens = record.split(",");
//			String dep = tokens[1];
//			double salary = Double.parseDouble(tokens[2]);
//			if (!map.containsKey(dep))
//				map.put(dep, salary);
//			else
//				map.put(dep, map.get(dep) + salary);
//		}
//
//		System.out.println(map);

		
		//-------------------------------------------------
		
		
		System.out.println(
				
			Arrays
			.stream(records)
			//.parallel()
			.map(record->record.split(","))
			.collect(HashMap<String,Double>::new,Q2::accumulate,Q2::combine)
		
		);
		
		
		
	}
	
	public static void accumulate(Map<String, Double> map, String[] tokens) {
		System.out.println(Thread.currentThread().getName());
		String dep = tokens[1];
		double salary = Double.parseDouble(tokens[2]);
		if (!map.containsKey(dep))
			map.put(dep, salary);
		else
			map.put(dep, map.get(dep) + salary);
	}

	public static void combine(HashMap<String, Double> map1, HashMap<String, Double> map2) {
		Set<String> keys=map2.keySet();
		for(String key:keys) {
			if(!map1.containsKey(key)) {
				//..
			}
				//..
		}
		
	}

}
