package javaCollectionsPractice;

import java.util.TreeMap;

public class treeMapIterator {
	public static void main(String[] args)
    {
        TreeMap<Integer, String> treeMapDogTypes = new TreeMap<Integer, String>();
        treeMapDogTypes.put(10, "Afador");
        treeMapDogTypes.put(15, "Golden retriever");
        treeMapDogTypes.put(20, "Border Collie");
        treeMapDogTypes.put(25, "Boxweiler");
        treeMapDogTypes.put(30, "Bulldog");
        System.out.println("Iterating treeMapDogTypes:");
        treeMapDogTypes.forEach((key, value) -> {
          System.out.println(key + "=" + value + " ");
          });
    }

}
