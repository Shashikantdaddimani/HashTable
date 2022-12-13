package com.java.hashtable;
/**
 * Class to create LinkedList with different methods
 *
 */
public class LinkedList {
	/*
	 * The append function allows you to add an item to the end of the list
	 */
	 public void append(String data,Node head) {
	       
	        Node newNode = new Node(data);
	        Node temp = head;
	        if (head == null) {
	            head = newNode;
	        } else {
	            while (temp.ref != null) {
	                temp = temp.ref;
	            }
	            temp.ref = newNode;
	        }
	    }
	 /*
	  *logic for Display method
	  */
	    public void display(Node head) {
	      
	        if (head == null) {
	            System.out.println(" list is empty");
	        } else {
	            Node temp = head;
	            while (temp != null) {
	                System.out.print(temp.data + ", ");
	                temp = temp.ref;
	            }
	            System.out.println();
	        }
	    }
}
