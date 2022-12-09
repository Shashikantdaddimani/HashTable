package com.java.hashtable;

/**
 * imports all the class of the java.util package
 */
import java.util.HashMap;
import java.util.Set;

/**
 * Class to create HashTable with different methods
 */
public class HashTable {
	/*
	 * Method Name :userInputSentence
	 * 
	 */
	static void userInputSentence(String userString) {
		HashMap<String, Integer> frequency = new HashMap<String, Integer>();
		String[] words = userString.split(" ");
		/*
		 * using forEach loop for iterating the given words
		 */
		for (String word : words) {
			if (frequency.containsKey(word)) {
				frequency.put(word, frequency.get(word) + 1);
			} else {
				frequency.put(word, 1);
			}
		}
		Set<String> stringFrequency = frequency.keySet();
		System.out.println("Frequency of words in sentence 'Paranoids are not paranoid because"
				+ " they are paranoid but because they keep putting themselves deliberately into"
				+ " paranoid avoidable situations' is");
		for (String word : stringFrequency) {
			if (frequency.get(word) > 1)
				System.out.println(word + " = " + frequency.get(word) + " times.");
		}
	}

	/*
	 * Program execution starts from main method
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the HashTable program");
		userInputSentence("Paranoids are not paranoid because they are paranoid but because "
				+ "they keep putting themselves deliberately into paranoid avoidable situations");
	}
}
