package com;

import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ex5 {

	public static Predicate<Integer> and(Predicate<Integer> min, Predicate<Integer> max) {
		Predicate<Integer> predicate = n -> min.test(n) && max.test(n);
		return predicate;
	}

	public static void writeToFile(String message) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("log.txt");
			writer.write(message);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		// #1
		// ----------------------------------------------------------------------

		Predicate<Integer> isMin = n -> n >= 100;
		Predicate<Integer> isMax = n -> n <= 1000;

		Predicate<Integer> andPredicate = and(isMin, isMax);
		Predicate<Integer> andPredicate2 = isMin.and(isMax);

		boolean b = andPredicate.test(100);
		System.out.println(b);

		// ----------------------------------------------------------------------

		// #2

		Consumer<String> consoleLogger = message -> System.out.println(message);
		Consumer<String> fileLogger = Ex5::writeToFile;
		Consumer<String> logger = consoleLogger.andThen(fileLogger);

		String logMessage = "intiaited...";
		// consoleLogger.accept(logMessage);
		// fileLogger.accept(logMessage);
		logger.accept(logMessage);

		// -------------------------------------------------------------------------
		
		

	}

}
