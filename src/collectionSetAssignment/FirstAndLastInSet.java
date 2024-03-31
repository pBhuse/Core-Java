package collectionSetAssignment;

import java.util.TreeSet;

public class FirstAndLastInSet {

	public static void main(String[] args)
	{
System.out.println("5] Write a Java program to get the first and last elements in a tree set.");
	TreeSet<String>ts=new TreeSet<String>();
	ts.add("Pratiksha");
	ts.add("Smita");
	ts.add("Reshma");
	ts.add("Sanmesh");
	System.out.println("Tree Set Elements :"+ts);
	// Find smallest/first element of the tree set
    Object first_element =  ts.first();

	System.out.println("First Element  :"+first_element);
	// Find largest/last element of the tree set

	Object last_element=ts.last();
	System.out.println("Last Element :"+last_element);
	}

}
