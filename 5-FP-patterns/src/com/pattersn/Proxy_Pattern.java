package com.pattersn;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

//-----------------------------------------------------------------------

class Arith_v1 {
	public static int square(int num) {
		long start = System.currentTimeMillis();
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int square = num * num;
		long end = System.currentTimeMillis();
		System.out.println("millis-" + (end - start));
		return square;

	}

	public static int cube(int num) {
		long start = System.currentTimeMillis();
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int square = num * num * num;
		long end = System.currentTimeMillis();
		System.out.println("millis-" + (end - start));
		return square;

	}
}

//-----------------------------------------------------------------------

class Arith_v2 {
	public static int square(int num) {
		int square = num * num;
		return square;
	}

	public static int cube(int num) {
		int square = num * num * num;
		return square;
	}
}

class TimeUtil {
	static long start;
	static long end;

	public static void start() {
		start = System.currentTimeMillis();
	}

	public static void end() {
		end = System.currentTimeMillis();
	}
}

class ArithProxy {
	public static int square(int num) {
		TimeUtil.start();
		int result = Arith_v2.square(num);
		TimeUtil.end();
		System.out.println(TimeUtil.end - TimeUtil.start);
		return result;
	}

	public static int cube(int num) {
		TimeUtil.start();
		int result = Arith_v2.cube(num);
		TimeUtil.end();
		System.out.println(TimeUtil.end - TimeUtil.start);
		return result;
	}
}

//-----------------------------------------------------------------------

class Arith_v3 {

	public static int hof(int num, Function<Integer, Integer> func) {
		TimeUtil.start();
		// ------------------------------------------
		int result = func.apply(num);
		// ------------------------------------------
		TimeUtil.end();
		System.out.println(TimeUtil.end - TimeUtil.start);
		return result;

	}

}

//-----------------------------------------------------------------------

public class Proxy_Pattern {

	public static void main(String[] args) {

		// System.out.println(ArithProxy.square(12));

		int result = Arith_v3.hof(5, n -> n * n);
		System.out.println(result);
		result = Arith_v3.hof(5, n -> n * n * n);
		System.out.println(result);

	}

}
