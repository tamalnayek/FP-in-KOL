package com;

import java.util.function.Consumer;

public class Ex6 {

	static String companyName = "IBM";
	int duration = 0;

	public Consumer<String> doTeach(String sub) {

		System.out.println("teaching " + sub);

		final String notes = sub + "-notes";

		Consumer<String> doLearn = name -> {
			System.out.println(name + " learning..with " + notes + " => " + this.duration + " in " + companyName);
		};

		System.out.println("teaching ends..");

		return doLearn;

	}

	public static void main(String[] args) {

		Ex6 tnr1 = new Ex6();
		tnr1.duration = 3;
		Consumer<String> doLearnFunc = tnr1.doTeach("java");
		doLearnFunc.accept("Emp-1");

		tnr1.duration = 5;
		doLearnFunc = tnr1.doTeach("java");
		doLearnFunc.accept("Emp-1");

		Ex6 tnr2 = new Ex6();
		tnr2.duration = 10;
		doLearnFunc = tnr2.doTeach("java");
		doLearnFunc.accept("Emp-1");
	}

}
