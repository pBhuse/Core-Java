package CollectionAssignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class SortElementsByUsingCollectionClass {

	public static void main(String[] args)
	{
System.out.println("Q2. How to sort element of list classes & keep duplicates?Collections.sort()");
	ArrayList<Integer>al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(50);
	al.add(20);
	al.add(10);
	Collections.sort(al);
	System.out.println(al);
	TreeSet<Integer>ts= new TreeSet<Integer>(al);
	System.out.println(ts);
	
	
	
	
	}

}
