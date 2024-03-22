package collectionListAssignment;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator {

	public static void main(String[] args)
	{
     System.out.println("Q3.Write a Java program to iterate through all elements in a linked list using Iterator and for each loop.");
	LinkedList<Integer>ll=new LinkedList<Integer>();
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.add(40);
    System.out.println("Iterate The LinkedList Element By Using Iterator :");
	Iterator<Integer>il=ll.iterator();
	while(il.hasNext())
	{
		System.out.print("\t"+il.next());
	}
	System.out.println();
    System.out.println("Iterate The LinkedList Element By Using forEach loop :");
for (Integer integer : ll)
{
	System.out.print("\t"+integer);
}
	
	
	}

}
