package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

class FoodUtil {
	public static boolean canIRemoveNonVegItem(String item) {
		return item.equals("nveg");
	}
}

class Util {
	public static void staMethod(int n1) {
		System.out.println("-----------------------");
		System.out.println(n1);
		System.out.println("-----------------------");
	}

	public static void staMethod(int n1, int n2) {
		System.out.println("-----------------------");
		System.out.println(n1 + "," + n2);
		System.out.println("-----------------------");
	}
}

class Food {

	private String name;
	private String type;

	public Food(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public Food(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", type=" + type + "]";
	}

}

public class Ex4 {

	public static void main(String[] args) {

		// ------------------------------------------------------------------

//		List<String> list = new ArrayList<>();
//		list.add("veg");
//		list.add("nveg");
//		list.add("veg");
//		list.add("nveg");

		// list.removeIf(item -> item.equals("nveg"));
		// list.removeIf(item -> FoodUtil.canIRemoveNonVegItem(item));
		// list.removeIf(FoodUtil::canIRemoveNonVegItem); // Method Reference ==>
		// short-hand notation, to refer existing methods as function

		// ------------------------------------------------------------------

		// a. static-method reference

//		ToIntFunction<String> toIntFunction = s -> Integer.parseInt(s);
//		ToIntFunction<String> toIntFunction2 = Integer::parseInt;
//
//		IntConsumer intConsumer = Util::staMethod;
//		intConsumer.accept(12);
//
//		BiConsumer<Integer, Integer> biConsumer = Util::staMethod;
//		biConsumer.accept(12, 13);

		// ------------------------------------------------------------------

		// b. specified instance-method-reference

		// String str = "ibm";

		// IntSupplier intSupplier=()->str.length();
		// or
		// IntSupplier intSupplier = str::length;

		// ------------------------------------------------------------------

		// c. un-specified instance-method-reference

		// ToIntFunction<String> toIntFunction=s->s.length();
		// or
		// ToIntFunction<String> toIntFunction = String::length;

		// BiFunction<String, Integer, String> biFunction=String::substring;
		// System.out.println(biFunction.apply("abc", 1));

		// ------------------------------------------------------------------

		// d. constructor reference

//		Function<String, Food> function = name -> new Food(name);
//		Function<String, Food> function2 = Food::new;
//		BiFunction<String, String, Food> biFunction = (name, type) -> new Food(name, type);
//		BiFunction<String, String, Food> biFunction2 = Food::new;

		// ------------------------------------------------------------------

//		Supplier<Thread>  supplier=Thread::currentThread;

//		List<String> list = new ArrayList<>();
//		list.add("veg");
//		list.add("nveg");
//		list.add("veg");
//		list.add("nveg");

//		list.forEach(item->System.out.println(item));
		// or
//		list.forEach(System.out::println);

		// ------------------------------------------------------------------

	}

}
