package com.bridgelabz;

public class TestCase {

	public static <E> void toPrint(E[] inputArray) {
		for(E element : inputArray) {
			System.out.printf("%s",element);
		}
		System.out.println();
	}


	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4 };
		Character[] CharArray = {'H', 'E', 'L', 'L', 'o'};
		
		TestCase.toPrint(intArray);
		TestCase.toPrint(doubleArray);
		TestCase.toPrint(CharArray);
	}
}
