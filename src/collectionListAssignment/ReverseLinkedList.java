package collectionListAssignment;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {

	public static void main(String[] args)
	{
		System.out.println("Q4. Write a Java program to iterate a linked list in reverse order");
		LinkedList<Integer>ll=new LinkedList<Integer>();
		ll.add(15);
		ll.add(10);
		ll.add(19);
		ll.add(12);
		System.out.println("LinkedList Elements Are :"+ll);
		System.out.println("=========== LinkedList Element In Reverse Order=========");
		 ListIterator<Integer>il=ll.listIterator(ll.size());
			while(il.hasPrevious())
			{
				System.out.print("\t"+il.previous());
			}
	
	}

}
