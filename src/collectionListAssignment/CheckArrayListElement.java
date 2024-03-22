package collectionListAssignment;

import java.util.ArrayList;

public class CheckArrayListElement {

	public static void main(String[] args)
	{
		
		System.out.println("Q5.Given an element write a program to check if element(value) exists in ArrayList");
	
		ArrayList<Float>al=new ArrayList<Float>();
		al.add(8.6f);
		al.add(4.5f);
		al.add(3.9f);
		al.add(8.2f);
		System.out.println("ArrayList Elements Are:"+al);
		boolean b=al.contains(3.9f);
		if(b==true)
		{
			System.out.println(b+" :3.9 exists in ArrayList");
		}
		else
		{
			System.out.println(b+" 3.9 not exists in ArrayList");

		}
	}

}
