package collectionListAssignment;

import java.util.ArrayList;

public class CopyArrayList {

	public static void main(String[] args)
	{
          System.out.println("Q1. Write a Java program to copy one array list of String into another");
          
          ArrayList<String>al=new ArrayList<String>();
          al.add("Sangola");
          al.add("Pune");
          al.add("Solapur");
          al.add("Mumbai");
          al.add("Sangli");
          System.out.println("First ArrayList Element Are :"+al);
          ArrayList<String>als=new ArrayList<String>();
          System.out.println("Copied ArrayList Element Are :");
          for(int i=0;i<al.size();i++)
          {
        	als=al;
        	//System.out.print(" "+als.get(i));
          }
          System.out.println(als);
        
	}

}
