package com;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.function.Function;

public class Ex7 {

	public static void main(String[] args) {

		// --------------------------------------------------

//		int v = 1 + 2;
//		Function<Integer, Integer> function = n -> n + 1;
//
//		if (true) {
//			int v2 = function.apply(10);
//			System.out.println(v2);
//		}

		// --------------------------------------------------

		int r = compute("hello", null);
		System.out.println(r);

	}

	public static String getSystemStatus() {
		System.out.println("collecting system status....");
		return LocalDateTime.now().toString();
	}

//	public static int compute(String s1, String s2) {
//		s1 = Objects.requireNonNull(s1, "string s1 cannot be null : " + getSystemStatus());
//		s2 = Objects.requireNonNull(s2, "string s2 cannot be null : " + getSystemStatus());
//		return s1.hashCode() ^ s2.hashCode();
//	}

	public static int compute(String s1, String s2) {
		s1 = Objects.requireNonNull(s1, () -> "string s1 cannot be null : " + getSystemStatus());
		s2 = Objects.requireNonNull(s2, () -> "string s1 cannot be null : " + getSystemStatus());
		return s1.hashCode() ^ s2.hashCode();
	}

}
