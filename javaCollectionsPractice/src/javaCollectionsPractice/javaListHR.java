package javaCollectionsPractice;
import java.util.*;

public class javaListHR {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int value = scan.nextInt();
            list.add(value);
        }
        
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            String data = scan.next();
            if (data.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else { 
            	int index = scan.nextInt();
                list.remove(index);
            }
        }
        scan.close();
        
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }

}
