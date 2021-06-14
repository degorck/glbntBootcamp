package javaCollectionsPractice;

import java.util.LinkedList;

public class linkedListAddMiddle {
	public static void main(String args[]){
	     LinkedList<String> teletubbies=new LinkedList<String>();
	     teletubbies.add("Tinky Winky");
	     teletubbies.add("Laa-Laa");
	     teletubbies.add("Po");
	     System.out.println(teletubbies);
	     System.out.println("Adding Dipsy");
	     teletubbies.add(1, "Dipsy");
	     System.out.println(teletubbies);
}
}
