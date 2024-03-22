package CollectionAssignment2;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class MaintainInsertionOrder
{
public static void main(String[] args)
{
	System.out.println("Q.3] How to remove duplicate element of list class and maintain insertion order?( -LinkedHashSet)");
	ArrayList<Integer>al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(20);
	al.add(10);
	al.add(20);
	System.out.println("Element Before maintaining the  insertion order Of arrayList :"+al);
	LinkedHashSet<Integer>lhs=new LinkedHashSet<Integer>(al);
	System.out.println("Element After maintaining the  insertion order"+lhs);
}
}
