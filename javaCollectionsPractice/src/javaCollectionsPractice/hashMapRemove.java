package javaCollectionsPractice;

import java.util.HashMap;

public class hashMapRemove {
	public static void main(String[] args)
    {
 
        HashMap<Integer, String> hashMapCatTypes = new HashMap<Integer, String>();
        hashMapCatTypes.put(1, "Abyssinian Cat");
        hashMapCatTypes.put(3, "American Bobtail Cat Breed");
        hashMapCatTypes.put(5, "American Curl Cat Breed");
        hashMapCatTypes.put(7, "American Shorthair Cat");
        hashMapCatTypes.put(9, "American Wirehair Cat Breed");
        System.out.println(hashMapCatTypes);
        System.out.println("Removig Abyssinian Cat");
        hashMapCatTypes.remove(1);
        System.out.println(hashMapCatTypes);
    }
}
