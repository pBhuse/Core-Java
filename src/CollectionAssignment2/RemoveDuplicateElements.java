package CollectionAssignment2;

import java.util.ArrayList;
import java.util.TreeSet;

public class RemoveDuplicateElements {

	public static void main(String[] args)
	{

		
		System.out.println(" Q1.How to sort element of list classes and remove duplicates? (-TreeSet)");
        ArrayList<Integer>al=new ArrayList<Integer>();
        al.add(10);
        al.add(20);
       al.add(30);
       al.add(40);
       al.add(10);
       al.add(20);
       System.out.println("Elements of ArrayList Before sorting :"+al);
       // TreeSet maintains  element in ascending order.
       TreeSet<Integer>ts=new TreeSet<Integer>(al);
       System.out.println("Elements of ArrayList After sorting(Using TreeSet :)"+ts);
		
		
	}

}
