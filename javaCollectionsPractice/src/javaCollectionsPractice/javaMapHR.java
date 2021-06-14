package javaCollectionsPractice;
import java.util.*;

public class javaMapHR {
	public static void main(String []argh)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		Map<String, Integer> telNumbers = new HashMap<>(n);
		for(int i=0;i<n;i++)
		{
			String name=scan.nextLine();
			int phone=scan.nextInt();
			scan.nextLine();
			telNumbers.put(name, phone);
		}
		while(scan.hasNext())
		{
			String s=scan.nextLine();
			if(telNumbers.containsKey(s))
	        {
	            System.out.println(s + "=" + telNumbers.get(s));
	        }
	        else
	        {
	            System.out.println("Not found");
	        }
		}
		scan.close();
	}

}
