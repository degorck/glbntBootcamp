package javaCollectionsPractice;

import java.util.HashMap;

public class hashMapIterator {
	public static void main(String[] args)
    {
 
        HashMap<Integer, String> hashMapCatTypes = new HashMap<Integer, String>();
        hashMapCatTypes.put(1, "Abyssinian Cat");
        hashMapCatTypes.put(3, "American Bobtail Cat Breed");
        hashMapCatTypes.put(5, "American Curl Cat Breed");
        hashMapCatTypes.put(7, "American Shorthair Cat");
        hashMapCatTypes.put(9, "American Wirehair Cat Breed");
        System.out.println("Iterating hashMapCatTypes");
        hashMapCatTypes.forEach((key, value) -> {
          System.out.println(key + "=" + value + " ");
          });
        
    }

}
