package collectionSetAssignment;
/* JDK 1.4
 * we can not use for, while loop  to traversing  the HashSet element.
 *use only iterator and Foreach loop.
 *not maintain  the insertion order. 
*/
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args)
	{
      System.out.println("Q1).Write a program to traverse(or iterate) HashSet using iterator and for each loop?");
	
	HashSet<Integer>hs=new HashSet<Integer>();
	hs.add(10);
	hs.add(20);
	hs.add(30);
	hs.add(10);//ignore the duplicate element 
	hs.add(40);
	System.out.println("To traverse(or iterate) HashSet using iterator");
	Iterator<Integer>il= hs.iterator();
	while(il.hasNext())
	{
		System.out.println(il.next());
	}
	System.out.println("To traverse(or iterate) HashSet using forEach ");
    for(Integer val :hs)
    {
    	System.out.println(val);
    }
    
	}

}
