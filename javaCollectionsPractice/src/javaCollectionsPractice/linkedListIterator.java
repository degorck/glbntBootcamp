package javaCollectionsPractice;

import java.util.*;

public class linkedListIterator {
	public static void main(String args[]){
	     LinkedList<String> teletubbies=new LinkedList<String>();
	     teletubbies.add("Tinky Winky");
	     teletubbies.add("Dipsy");
	     teletubbies.add("Laa-Laa");
	     teletubbies.add("Po");
	     System.out.println("Iterating teletubbies:");
	     
	     Iterator<String> iterator=teletubbies.iterator();
	     while(iterator.hasNext()){
	       System.out.println(iterator.next());
	     }
	   } 
}
