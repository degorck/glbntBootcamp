package javaCollectionsPractice;

import java.util.*;

public class arrayListSorting {
	public static void main(String[] args) {
	    ArrayList<String>  donaldsNephews = new ArrayList<String>();
	    donaldsNephews.add("Hugo");
	    donaldsNephews.add("Paco");
	    donaldsNephews.add("Luis");
	    donaldsNephews.add("Donald");
	    System.out.println(donaldsNephews);
	    System.out.println("Sorting donaldsNephews");
	    Collections.sort(donaldsNephews);
	    System.out.println(donaldsNephews);
	  }
}
