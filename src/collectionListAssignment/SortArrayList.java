package collectionListAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList 
{
public static void main(String[] args)
{
	System.out.println("Q2.Write a Java program to sort a given array list.");
	ArrayList<Integer>al=new ArrayList<Integer>();
	al.add(10);
	al.add(5);
	al.add(13);
	al.add(20);
	System.out.println("ArrayList element Before sorting :"+al);
	//al.sort(null); or
	//Collections.sort(al);
	//System.out.println(al);
	for(int i=0;i<al.size();i++)
	{
		for(int j=i+1;j<al.size();j++)
		{
			if(al.get(i)>al.get(j))
			{
			Integer tmp=al.get(i);
			al.set(i, al.get(j));
			al.set(j, tmp);
			}
		}
	}
	System.out.println("ArrayList element After sorting :"+al);


//	for (Integer val : al)
//	{
//		//System.out.println(val);// 5 10 13 20
//	}
//	
	
}
}
