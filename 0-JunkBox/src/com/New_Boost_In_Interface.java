package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

interface Scalable {
	void setScale(double v);

	default void reset() {
		// ..
	}

	static boolean isScalable(Object box) {
		return box instanceof Scalable;
	}
}

class Box implements Scalable {
	@Override
	public void setScale(double v) {

	}
}

public class New_Boost_In_Interface {

	public static void main(String[] args) {

		// Box box = new Box();
		// box.reset();

		// System.out.println(Scalable.isScalable(box));

		// ------------------------------------------------------

		// Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);
		// Comparator<String> reversedComparator = (s1, s2) -> s2.compareTo(s1);
		// Comparator<String> reversedComparator = comparator.reversed();

		// System.out.println(comparator.compare("hello", "world"));
		// System.out.println(reversedComparator.compare("hello", "world"));

		// ------------------------------------------------------

//		Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);
//		Comparator<String> newComparator = Comparator.nullsLast(comparator);
//		int diff = newComparator.compare("hello", null);
//		System.out.println(diff);

		// ------------------------------------------------------------


	}

}
