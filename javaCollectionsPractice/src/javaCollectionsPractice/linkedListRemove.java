package javaCollectionsPractice;

import java.util.LinkedList;

public class linkedListRemove {
	public static void main(String args[]){
	     LinkedList<String> teletubbies=new LinkedList<String>();
	     teletubbies.add("Tinky Winky");
	     teletubbies.add("Dipsy");
	     teletubbies.add("Laa-Laa");
	     teletubbies.add("Po");
	     teletubbies.addFirst("Baby Sun");
	     System.out.println(teletubbies);
	     System.out.println("Removing Baby Sun");
	     teletubbies.remove(0);
	     System.out.println(teletubbies);
	   } 
}
