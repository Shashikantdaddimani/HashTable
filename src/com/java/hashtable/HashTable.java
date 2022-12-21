package com.java.hashtable;
/*
 * imports all the class of the java.util package
 */

import java.util.HashMap;
import java.util.Set;

/**
 * Class to create HashTable with different methods
 */
public class HashTable {
	static void userInputSentence(String userString) {
		HashMap<String, Integer> frequency = new HashMap<String, Integer>();
		String[] words = userString.split(" ");
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

	public static void remove(String string, String removeWord) {
		/*
		 *  split words from the sentence to store in String array using split()
		 */
		String[] stringArray = string.split(" ");
		String newSentenceAfterRemovingWord = " ";
		  
		/*
		 * Iterating By using for each loop
		 */
		for (String words : stringArray) {
			/*
			 *  ! exclamation mark is used as not equal to sign
			 */
			if (!words.equals(removeWord)) {
				// iterate till end and remove "avoidable" from the paragraph
				newSentenceAfterRemovingWord = newSentenceAfterRemovingWord + words + " ";

			}
		}
		/*
		 * new sentence after removing "avoidable" word.
		 */
		System.out.println(newSentenceAfterRemovingWord);
	}

	public static void main(String[] args) {

		userInputSentence("Paranoids are not paranoid because they are paranoid but because "
				+ "they keep putting themselves deliberately into paranoid avoidable situations");
		
		System.out.println("===========================================================================================");
		String string = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String removeWord = "avoidable";
		remove(string, removeWord);
	}
}
