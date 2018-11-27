package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex3 {

	public static void main(String[] args) {

//Streams can only be traversed once 		 	

		Stream<Integer> fib = Stream.of(1, 1, 2, 3);
		fib = fib.limit(2);
//		fib.forEach(System.out::println);

		fib.forEach(System.out::println);

	}

}
