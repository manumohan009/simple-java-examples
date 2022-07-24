package com.manu.collections;

import java.util.Iterator;
import java.util.List;

public class ListRunner {

	public static void main(String[] args) {
		List<String> words = List.of("Cat", "Bat", "Dog", "Elephant");
		System.out.println(words.size());
		System.out.println(words.isEmpty());
		System.out.println(words);
		System.out.println(words.get(3));
		System.out.println(words.contains("Dog"));
		System.out.println(words.indexOf("Dog"));
		for(String word: words) {
			System.out.println(word);
		}
		
//		Iterator<String> wordsIterator = words.iterator();
//		while(wordsIterator.hasNext()) {
//			System.out.println(wordsIterator);
//		}
		
	}

}
