package com.manu.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat");
		List<Integer> numbers = List.of(10,13,2,4,6,14,19,20);
		
//		printBasic(list);
		printWithFP(list);
//		printBasicWithFiltering(list);
//		printWithFPWithFiltering(list);
		printOddNumbers(numbers);
//		findSum(numbers);
//		sumOfNNumbers(10);

	}

	private static void printBasic(List<String> list) {
		for(String string: list) {
			System.out.println(string);
		}
	}
	
	private static void printWithFP(List<String> list) {
		list.stream()
		.map(element -> element.toLowerCase())
		.forEach(element -> System.out.println(element));
	}
	
	private static void printBasicWithFiltering(List<String> list) {
		for(String string: list) {
			if(string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}
	private static void printWithFPWithFiltering(List<String> list) {
		
		list.stream()
			.filter(element -> element.endsWith("at"))
			.forEach(element -> System.out.println("element - " + element));
	}
	
	private static void printOddNumbers(List<Integer> numbers) {
		numbers.stream()
			.filter(n -> n%2==0)
			.sorted()
			.distinct()
			.map(n-> n +10)
			.collect(Collectors.toList())
			.stream().forEach(n->System.out.println(n));
	}
	
	private static void findSum(List<Integer> numbers) {
		int sum = numbers.stream()
			.reduce(0,(number1, number2)-> number1+number2);
		System.out.println(sum);
	}
	
	private static void sumOfNNumbers(int n) {
		int sum = IntStream.range(1,n+1)
			.reduce(0, (n1,n2)-> n1+n2);
		System.out.println(sum);
			
	}

}
