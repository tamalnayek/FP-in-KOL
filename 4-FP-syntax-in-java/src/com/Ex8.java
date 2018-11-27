package com;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 *  https://www.baeldung.com/java-lambda-exceptions
 * 
 */

@FunctionalInterface
interface ThrowingConsumer<T, E extends Exception> {
    void accept(T t) throws E;
}

public class Ex8 {
	
	static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer) {
	    return i -> {
	        try {
	            consumer.accept(i);
	        } catch (ArithmeticException e) {
	            System.err.println(
	              "Arithmetic Exception occured : " + e.getMessage());
	        }
	    };
	}
	
	static void writeToFile(Integer integer) throws IOException {
	    // logic to write to file which throws IOException
	}
	
	static <T> Consumer<T> throwingConsumerWrapper(
			  ThrowingConsumer<T, Exception> throwingConsumer) {
			  
			    return i -> {
			        try {
			            throwingConsumer.accept(i);
			        } catch (Exception ex) {
			            throw new RuntimeException(ex);
			        }
			    };
			}

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(3, 9, 7, 6, 0, 10, 20);

//		integers.forEach(i -> System.out.println(50 / i));

//		integers.forEach(i -> {
//			try {
//				System.out.println(50 / i);
//			} catch (ArithmeticException e) {
//				System.err.println("Arithmetic Exception occured : " + e.getMessage());
//			}
//		});
		
//		integers.forEach(lambdaWrapper(i -> System.out.println(50 / i)));
//		integers.forEach(throwingConsumerWrapper(i->writeToFile(i)));

	}

}
