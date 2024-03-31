/*
 * jdk 1.2
 * Maintain in Ascending order.
 * Not Accept  The null values.
 */
package collectionSetAssignment;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class LessNumberInTreeSet {

	public static void main(String[] args)
	{
        System.out.println("6] Write a Java program to find the numbers less than 7 in a tree set.");
	Set<Integer>ts=new TreeSet<Integer>();
	ts.add(10);
	ts.add(20);
	ts.add(2);
	ts.add(5);
	ts.add(7);
	ts.add(3);
	ts.add(11);
	ts.add(9);
	ts.add(1);
	ts.add(0);
	ts.add(6);
	System.out.println("TreeSet Elements:"+ts);
	//headSet : To set the limit for a tree set, and return the elements up to a limit .
	TreeSet<Integer>head_set = new TreeSet<Integer>();
	head_set=(TreeSet<Integer>)((TreeSet<Integer>) ts).headSet(7);
	 Iterator<Integer>it=head_set.iterator();
	 System.out.println("Numbers less than 7 in a tree set.");
	 while(it.hasNext())
	 {
		 System.out.print("\t"+it.next());
	 }
	
	}

}
