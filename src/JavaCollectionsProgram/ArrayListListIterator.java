package JavaCollectionsProgram;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListListIterator
{
 
	public static void main(String[] args) 
	{
	ArrayList<Integer>al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	System.out.println(al);
	System.out.println("===========Print The Element In Forward direction =========");
	 ListIterator<Integer>lit=al.listIterator();
		System.out.println("Display First element :"+lit.next());  //10
		lit.remove();
		System.out.println("Element After Remove Operation :"+al);
		lit.add(60);//add()
		System.out.println("Element after Add operation :"+al);//[10, 60, 20, 30, 40, 50]
		//System.out.println(al);
     System.out.println("Display element by using next()");
	while(lit.hasNext()) {
	    System.out.println(lit.next());
	}
	System.out.println(al);
	//System.out.println(lit.next());     //Error  java.util.NoSuchElementException
	System.out.println("===========Print the Element Backward direction=========");
    System.out.println("Display element by using previous()");

	while(lit.hasPrevious()) {
	    System.out.println(lit.previous());
	}
	System.out.println();
	ArrayList<Integer>al1=new ArrayList<Integer>();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(400);
        al1.add(500);
        System.out.println("index");
	ListIterator<Integer>l=al1.listIterator(2);//index 
	System.out.println(" Given Elements:"+al1);
	System.out.println("Print the element from index 2 : ");
	while(l.hasNext()) {
	    System.out.println(l.next());
	}
	System.out.println("Implementation of Set():");
	ArrayList<Integer>al2=new ArrayList<Integer>();
    al2.add(110);
    al2.add(120);
    al2.add(130);
    al2.add(140);
    al2.add(150);
    ListIterator<Integer>l1=al2.listIterator();
    System.out.println("Before using the set() method : ");  

    while (l1.hasNext()) {  
        System.out.print("\t"+l1.next());  //110 120 130 140 150
    }  
    System.out.println();
    l1.set(190);  
    System.out.println("After using the set() method : ");  
    for (Integer i : al2) {  
        System.out.print("\t"+i);  //110 120 130 140 190	
    }	
}
}
