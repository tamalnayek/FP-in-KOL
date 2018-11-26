package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Q1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("veg");
		list.add("veg");
		list.add("nveg");
		list.add("veg");
		list.add("veg");
		list.add("veg");
		list.add("nveg");
		list.add("veg");
		
		
		String itemToRemove = "nveg";

		//------------------------------------------------
		// way-1: imperative style
		//------------------------------------------------

		/*
			Iterator<String> it = list.iterator();
			while (it.hasNext()) {
				String item = (String) it.next();
				if (item.equals(itemToRemove))
					it.remove();
			}
			System.out.println(list);
		*/

		//------------------------------------------------
		// way-2 : declarative style  with function
		//------------------------------------------------

		list.removeIf(item->item.equals(itemToRemove));
		System.out.println(list);
		
		//------------------------------------------------
		

	}

}
