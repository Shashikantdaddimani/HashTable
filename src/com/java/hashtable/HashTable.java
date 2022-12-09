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
		System.out.println("Frequency Of Each word in Sentence: \n 'To Be Or Not To Be'");
		for (String word : stringFrequency) {
			System.out.println(word + " = " + frequency.get(word) + " times.");

		}
	}

	/*
	 * Program execution starts from main method
	 */
	public static void main(String[] args) {
		userInputSentence("To Be Or Not To Be");
	}
}
