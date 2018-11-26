package com;

import java.util.function.Predicate;

/**
 * 
 * @author nag-training
 * 
 * 
 *         type of function/Lambda-expression in .java is 'Functional Interface'
 *         
 *         i.e FunctionalInterface ==> must have single-abstract-method ( SAM ) 
 *
 */

@FunctionalInterface
interface StringToIntMapper {
	int map(String s);
}

public class Ex1 {

	public static void main(String[] args) {

		// ---------------------------------------------------

		Predicate<Integer> isEqual = (n) -> n == 100;
		boolean b = isEqual.test(100);
		System.out.println(b);

		// ---------------------------------------------------

		// .class ==> instance
		StringToIntMapper mapper1 = new StringToIntMapper() {
			public int map(String s) {
				return s.length();
			}
		};

		// no .class , but it is 'function-instance'
		StringToIntMapper mapper2 = (String s) -> {
			return s.length();
		};
		StringToIntMapper mapper3 = (s) -> {
			return s.length();
		};
		StringToIntMapper mapper4 = s -> {
			return s.length();
		};
		StringToIntMapper mapper5 = s -> s.length();

		
		// --------------------------------------------------
	}

}
