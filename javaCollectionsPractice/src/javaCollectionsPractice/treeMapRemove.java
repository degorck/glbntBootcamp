package javaCollectionsPractice;

import java.util.TreeMap;

public class treeMapRemove {
	public static void main(String[] args)
    {
        TreeMap<Integer, String> treeMapDogTypes = new TreeMap<Integer, String>();
        treeMapDogTypes.put(10, "Afador");
        treeMapDogTypes.put(15, "Golden retriever");
        treeMapDogTypes.put(20, "Border Collie");
        treeMapDogTypes.put(25, "Boxweiler");
        treeMapDogTypes.put(30, "Bulldog");
        System.out.println(treeMapDogTypes);
        System.out.println("Removing Afador");
        treeMapDogTypes.remove(10);
        System.out.println(treeMapDogTypes);
    }

}
