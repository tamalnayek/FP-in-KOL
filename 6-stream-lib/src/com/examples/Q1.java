package com.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class MyList<E> implements Iterable<E> {
	// ..
	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			@Override
			public boolean hasNext() {
				return false;
			}

			@Override
			public E next() {
				return null;
			}
		};
	}
}

public class Q1 {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		Set<Integer> integers = new HashSet<>();
//		integers.add(1);
//		integers.add(2);
//		integers.add(3);
//		integers.add(4);
//		integers.add(5);

		// --------------------------------------------------------------
		// External Iteration
		// --------------------------------------------------------------

		// way-1
		for (int i = 0; i < integers.size(); i++) {
			Integer num = integers.get(i);
			System.out.println(num);
		}

		System.out.println();

		// way-2
		Iterator<Integer> it = integers.iterator();
		while (it.hasNext()) {
			Integer num = (Integer) it.next();
			System.out.println(num);
		}

		// way-3
		for (Integer i : integers) {
			System.out.println(i);
		}

		MyList<Integer> myList = new MyList<>();
		//
		for (Integer i : myList) {
			System.out.println(i);
		}

		// --------------------------------------------------------------
		
		// problems with external-iteration
		
		/*
		 * 
		 *  => by default, sequential
		 *  => may dirty/mutable variables
		 *  => hard to parallelize
		 *  => code in 'imperative-style'
		 *  
		 *  
		 *  
		 *  soln:
		 *  
		 *  	==> use 'stream library'  
		 *  
		 *  			=> internally iterates elements with declarative functions
		 *  
		 * 
		 */

		
		
		
	}

}
