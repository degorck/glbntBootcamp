package javaCollectionsPractice;

import java.util.Collections;
import java.util.LinkedList;

public class linkedListSorting {
	public static void main(String args[]){
	     LinkedList<String> teletubbies=new LinkedList<String>();
	     teletubbies.add("Tinky Winky");
	     teletubbies.add("Dipsy");
	     teletubbies.add("Laa-Laa");
	     teletubbies.add("Po");
	     System.out.println(teletubbies);
	     System.out.println("Sorting teletubbies:");
	     Collections.sort(teletubbies);
	     System.out.println(teletubbies);

	   } 

}
