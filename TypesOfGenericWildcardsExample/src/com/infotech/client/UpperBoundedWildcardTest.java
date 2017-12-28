package com.infotech.client;

//Java program to demonstrate Upper Bounded Wildcards
import java.util.Arrays;
import java.util.List;

class UpperBoundedWildcardTest {
	public static void main(String[] args) {

		// Upper Bounded Integer List
		List<Integer> intList = Arrays.asList(30, 300, 3000, 30000);

		// printing the sum of elements in list
		System.out.println("Total sum is:" + sum(intList));

		// Double list
		List<Double> doubleList = Arrays.asList(6.1, 9.12, 11.1);

		// printing the sum of elements in list
		System.out.print("Total sum is:" + sum(doubleList));
	}

	private static double sum(List<? extends Number> list) {
		double sum = 0.0;
		for (Number i : list) {
			sum += i.doubleValue();
		}
		return sum;
	}
}
