package com.bridgelabz;

public class TestMaximum {
	String x, y, z;

//constructor
	public TestMaximum(String x, String y, String z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

//checking max of three integers
	public static String testMaximum(String x, String y, String z) {
		String max = x;
		if (y.compareTo(max) > 0)
			max = y;

		if (z.compareTo(max) > 0)
			max = z;
		printMax(x, y, z, max);
		return max;

	}

	public static void printMax(String x, String y, String z, String max) {
		System.out.printf("\nThe max of %s , %s and %s\n is %s\n", x, y, z, max);
	}
}