package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Ex2 {
	
	public static void main(String[] args) {
		
		
		//way-1
		//Stream.of(1,2,3,4,5)
		//.forEach(System.out::println);
		
		//way-2
		//int[] nums= {1,2,3,4,5};
		//Arrays
		//.stream(nums)
		//.forEach(System.out::println);
		
		//way-3
		//List<Integer> integers=Arrays.asList(1,2,3,4,5);
		//integers.stream()
		//.forEach(System.out::println);
		
		//way-4
		
//		Random random=new Random();
//		
//		Stream<Integer> stream=
//		Stream
//		.generate(()->{
//			return random.nextInt();
//		});
//				
//		
//		stream
//		.peek(n->System.out.println("before filter: "+n))
//		.filter(n->n>0)
//		.peek(n->System.out.println("after filter: "+n))
//		.limit(10)
//		.forEach(System.out::println);
		
		//way-5:
//		
//		Stream.iterate(0, v->v+1)
//		.limit(10)
//		.forEach(System.out::println);
//		
		
		
		
		
		
	}

}
