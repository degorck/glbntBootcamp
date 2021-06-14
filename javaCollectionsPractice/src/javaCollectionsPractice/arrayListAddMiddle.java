package javaCollectionsPractice;

import java.util.ArrayList;

public class arrayListAddMiddle {
	public static void main(String[] args) {
	    ArrayList<String>  donaldsNephews = new ArrayList<String>();
	    donaldsNephews.add("Hugo");
	    donaldsNephews.add("Luis");
	    System.out.println(donaldsNephews);
	    System.out.println("Adding Paco");
	    donaldsNephews.add(1, "Paco");
	    System.out.println(donaldsNephews);
}

}
