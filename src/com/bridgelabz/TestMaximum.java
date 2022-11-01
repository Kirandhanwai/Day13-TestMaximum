package com.bridgelabz;

public class TestMaximum {
	int x, y, z;

//constructor
	public TestMaximum(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

//checking max of three integers
	public static Float testMaximum(Float x, Float y, Float z) {
		Float max = x;
		if (y.compareTo(max) > 0)
			max = y;

		if (z.compareTo(max) > 0)
			max = z;
		printMax(x, y, z, max);
		return max;

	}

	public static void printMax(Float x, Float y, Float z, Float max) {
		System.out.printf("\nThe max of %s , %s and %s \n is %s\n", x, y, z, max);
	}
}