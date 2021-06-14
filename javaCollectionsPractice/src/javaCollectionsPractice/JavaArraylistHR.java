package javaCollectionsPractice;
import java.io.*;
import java.util.*;

public class JavaArraylistHR {
	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        ArrayList<ArrayList<Integer>> queries = new ArrayList<>();
	        
	        for (int i = 0; i < n; i++) {
	            int d = scan.nextInt();
	            ArrayList<Integer> query = new ArrayList<>();
	            
	            for (int j = 0; j < d; j++) {
	                query.add(scan.nextInt());
	            }
	            
	            queries.add(query);
	        }
	        
	        int q = scan.nextInt();
	        
	        for (int i = 0; i < q; i++) {
	            int x = scan.nextInt();
	            int y = scan.nextInt();
	            
	            try {
	                System.out.println(queries.get(x - 1).get(y - 1));
	            } catch (IndexOutOfBoundsException e) {
	                System.out.println("ERROR!");
	            }
	        }
	        scan.close();
    }
}
