package com;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("veg");
		list.add("nveg");
		list.add("veg");
		list.add("nveg");

		// list.removeIf(item -> item.equals("nveg"));
		// list.replaceAll(item -> item.equals("nveg") ? "Nil" : item);
		// System.out.println(list);
		// list.forEach(item -> System.out.println(item));

		// list.sort((item1, item2) -> item1.compareTo(item2));
		// System.out.println(list);

	}

}
