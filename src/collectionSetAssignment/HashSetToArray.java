package collectionSetAssignment;

import java.util.HashSet;

public class HashSetToArray {

	public static void main(String[] args)
	{
     System.out.println("3] Write a program to convert HashSet to Array?");
     HashSet<Integer>hs=new HashSet<Integer>();
     hs.add(10);
     hs.add(20);
     hs.add(30);
     hs.add(40);
     hs.add(50);
     System.out.println("Set Elements are"+hs);
     Integer[] intArray= hs.toArray(new Integer[hs.size()]);
     hs.toArray(intArray);
     System.out.println("Array Elements are :");

     for (Integer integer : intArray) 
     {
		System.out.println(integer);
	}
     
	}

}
