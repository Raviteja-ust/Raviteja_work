package com.ust.Logical;

import java.util.List;

public class SumOfOddNumbersUsingReduceFunction {

	public static void main(String[] args) {
		var listOfNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		var oddsum = listOfNumbers.stream().filter(a -> a % 2 != 0).reduce(0, (num1, num2) -> num1 + num2);
		System.out.println("oddsum==>" + oddsum);

		var repeatedsum = listOfNumbers.stream().filter(a -> a % 2 != 0).reduce(0, (num1, num2) -> num1 + num2);
		System.out.println(repeatedsum);

	}

}