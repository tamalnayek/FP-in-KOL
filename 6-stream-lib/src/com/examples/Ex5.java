package com.examples;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Ex5 {
	
	public static void main(String[] args) {
		
		IntStream intStream=IntStream.range(1, 1000);
		
		IntSummaryStatistics statistics=
		intStream
		.filter(n->n<=10)
		//.reduce((acc,next)->acc+next);
		.summaryStatistics();
		
		System.out.println(statistics.getCount());
		System.out.println(statistics.getSum());
		System.out.println(statistics.getAverage());
		System.out.println(statistics.getMin());
		System.out.println(statistics.getMax());
		
	}

}
