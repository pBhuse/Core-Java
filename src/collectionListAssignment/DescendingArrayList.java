package collectionListAssignment;

import java.util.ArrayList;

public class DescendingArrayList {

	public static void main(String[] args) 
	{
		System.out.println("Q6.Write a program to sort ArrayList in descending order");
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(60);
		al.add(12);
		al.add(50);
        al.add(45);
        System.out.println("ArrayList Elements Are :"+al);
        System.out.println(" ArrayList Elements in descending order :");
        for(int i=0;i<al.size();i++)
        {
        	for(int j=i+1;j<al.size();j++)
        	{
        		if(al.get(i)<al.get(j))
        		{
        			Integer tmp=al.get(i);
        			al.set(i, al.get(j));
        			al.set(j, tmp);
        			
        		}
        	}
        }
        System.out.println(al);
	}

}
