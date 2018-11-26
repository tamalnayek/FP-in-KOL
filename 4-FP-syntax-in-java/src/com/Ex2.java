package com;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Ex2 {

	public static void main(String[] args) {

		// -------------------------------------------------------------------

		Predicate<String> isEmpty = s -> s.isEmpty();
		BiPredicate<String, Integer> biPredicate = (s, n) -> s.length() == n;

		Supplier<String> strSupplier = () -> "FP in java";
		String str = strSupplier.get();

		Consumer<String> logger = s -> System.out.println(s);
		logger.accept(str);

		Function<String, Integer> function = s -> s.length();
		// System.out.println(function.apply("ibm"));

		BiFunction<Integer, Integer, String> biFunction = (n1, n2) -> String.valueOf(n1 + n2);
		String result = biFunction.apply(12, 13);
		// System.out.println(result);

		//
		UnaryOperator<Integer> unaryOperator = n -> n + 10;
		BinaryOperator<Integer> binaryOperator = (n1, n2) -> n1 + n2;

		// -------------------------------------------------------------------

		// BinaryOperator<Integer> add = (n1, n2) -> n1 + n2;
		// int sumResult = add.apply(12, 13);
		// or
		IntBinaryOperator intBinaryOperator = (n1, n2) -> n1 + n2;
		int sumResult = intBinaryOperator.applyAsInt(12, 13);

		// -------------------------------------------------------------------

		ToIntFunction<String> toIntFunction = s -> s.length();
		IntToDoubleFunction intToDoubleFunction = i -> 10.0;

		IntUnaryOperator intUnaryOperator = i -> 10;

		// -------------------------------------------------------------------

	}

}
