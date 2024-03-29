/* JDK 1.4
 * we can not use for, while loop  to traversing  the HashSet element.
 *use only iterator and Foreach loop.
 *not maintain  the insertion order. 
*/
package collectionSetAssignment;
import java.util.HashSet;
public class checkElementInHashSet 
{

	public static void main(String[] args) 
	{
		System.out.println("2]write a program to check if element exists in HashSet?");
     HashSet<String>hs=new HashSet<String>();
     hs.add("Sangewadi");
     hs.add("Sangola");
     hs.add("pandharpur");
     hs.add("manjari");
    boolean b= hs.contains("Sangewadi");
    if(b==true)
    {
    	System.out.println("Element exit in HashSet");
    }
    else
    {
    	System.out.println("Element not exit in HashSet");

    }
	}

}
