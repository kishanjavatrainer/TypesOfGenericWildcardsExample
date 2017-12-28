package com.infotech.client;

//Java program to demonstrate Unbounded wildcard
import java.util.Arrays;
import java.util.List;

class UnboundedWildcardTest {
	public static void main(String[] args) {

		// Integer List
		List<Integer> intList = Arrays.asList(10, 30, 90);
		print(intList);
		
		// Double list
		List<Double> doubleList = Arrays.asList(10.11, 20.22, 30.12);
		print(doubleList);
	}
	private static void print(List<?> list) {
		System.out.println(list);
	}
}