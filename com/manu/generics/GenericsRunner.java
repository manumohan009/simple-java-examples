package com.manu.generics;

import java.util.List;

public class GenericsRunner {
	
	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for(Number number:numbers) {
			sum +=number.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		MyCustomList<String> list1 = new MyCustomList();
		list1.addElement("Element 1");
		list1.addElement("Element 2");
		System.out.println(list1);
		
		MyCustomList<Integer> list2 = new MyCustomList();
		list2.addElement(1);
		list2.addElement(10);
		System.out.println(list2);
		
		System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));

	}
}
