package javaCollectionsPractice;

import java.util.ArrayList;

public class arrayListRemove {

	 public static void main(String[] args) {
		    ArrayList<String>  donaldsNephews = new ArrayList<String>();
		    donaldsNephews.add("Hugo");
		    donaldsNephews.add("Donald");
		    donaldsNephews.add("Paco");
		    donaldsNephews.add("Luis");
		    System.out.println(donaldsNephews);
		    System.out.println("Deleting uncle Donald");
		    donaldsNephews.remove(1);
		    System.out.println(donaldsNephews);
}
}
