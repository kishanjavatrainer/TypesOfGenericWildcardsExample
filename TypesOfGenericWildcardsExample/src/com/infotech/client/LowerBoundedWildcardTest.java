package com.infotech.client;

//Java program to demonstrate Lower Bounded Wildcards
import java.util.ArrayList;
import java.util.List;

class LowerBoundedWildcardTest {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(80);
		intList.add(800);
		intList.add(8000);

		//Integer list object is being passed
		print(intList);

		List<Number> numList = new ArrayList<>();
		numList.add(40);
		numList.add(50);
		numList.add(60);
		numList.add(90);
		
		//Number list object is being passed
		print(numList);
	}
	public static void print(List<? super Integer> list) {
		System.out.println(list);
	}
}