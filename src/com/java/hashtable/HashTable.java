package com.java.hashtable;
/*
 * imports all the class of the java.util package
 */
import java.util.ArrayList;

/**
 * Class to create HashTable with different methods
 */
public class HashTable {
	/*
	 * declaring the arrayList
	 */
	 public ArrayList<Node> HashTable;
	    LinkedList List;

	    private String hashMapFunction(String value) {
	        return value;
	    }
	    /*
	     * constructor
	     */
	    public HashTable() {
	        HashTable = new ArrayList<Node>();
	        List = new LinkedList();
	    }

	    public void addValue(String value) {

	        String hashKey = hashMapFunction(value);
	        Node head = null;
	        if (HashTable == null) {
	            Node newNode = new Node(hashKey);
	            HashTable.add(newNode);
	        }
	        for (Node node : HashTable) {
	            if (node.data.equals(hashKey)) {
	                head = node;
	            }
	        }
	        if (head == null) {
	            Node newNode = new Node(hashKey);
	            HashTable.add(newNode);
	            head = newNode;
	        }
	        List.append(value, head);
	        for (Node node : HashTable) {
	            if (node.data.equals(hashKey)) {
	                node = head;
	            }
	        }

	    }

	    public void displayHashTable(ArrayList<Node> hashMap) {
	        for (Node node : hashMap) {
	            System.out.print(node.data + "=>");
	            List.display(node.ref);
	            System.out.println();
	        }
	    }
	   /*
	    * Program execution starts from main method
	    */
	    public static void main(String[] args) {
	    	System.out.println("welcome to the HashTable Program");
	    	/*
	    	 * creating the class Object
	    	 */
	        HashTable hashTable = new HashTable();
	        String paragrap = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves "
	        		           + "deliberately into paranoid avoidable situations";
	        String[] stringArray = paragrap.split(" ");
	        for (int i = 0; i < stringArray.length; i++) {
	            hashTable.addValue(stringArray[i]);
	        }

	        hashTable.displayHashTable(hashTable.HashTable);
	    }
}
