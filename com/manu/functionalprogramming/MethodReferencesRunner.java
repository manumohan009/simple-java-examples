package com.manu.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;

public class MethodReferencesRunner {
	
	public static void print(Integer number) {
		System.out.println(number);
	}
	
	public static boolean isEven(Integer number) {
		return number%2==0;
	}

	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant")
			.stream()
			.map(s->s.length())
			.forEach(s-> MethodReferencesRunner.print(s));
		
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant")
		.stream()
		.map(String::length)
		.forEach(MethodReferencesRunner::print);
		
		Integer max = List.of(23,45,67,34).stream()
				.filter(createEvenPredicate())
				.max((n1,n2)-> Integer.compare(n1,n2))
				.orElse(0);
		System.out.println(max);
		
		Integer max1 = List.of(23,45,67,34).stream()
				.filter(MethodReferencesRunner::isEven)
				.max(Integer::compare)
				.orElse(0);
		System.out.println(max1);
		
//		Storing functions in variables
		Predicate<? super Integer> evenPredicate = createEvenPredicate();
		Integer max2 = List.of(23,45,67,34).stream()
				.filter(evenPredicate)
				.max((n1,n2)-> Integer.compare(n1,n2))
				.orElse(0);
		System.out.println(max);
		
//		Returning functions from methods
		Predicate<? super Integer> evenPredicate1 = createEvenPredicate();
		Integer max3 = List.of(23,45,67,34).stream()
				.filter(evenPredicate1)
				.max((n1,n2)-> Integer.compare(n1,n2))
				.orElse(0);
		System.out.println(max);

	}

	private static Predicate<? super Integer> createEvenPredicate() {
		return n-> n%2==0;
	}

}
