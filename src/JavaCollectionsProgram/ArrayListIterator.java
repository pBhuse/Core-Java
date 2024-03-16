package JavaCollectionsProgram;
/*   The Java Iterator is an interface added in the Java Programming language
 *   in the Java 1.2 Collection framework. 
 *   It belongs to java.util package.
     supports the operations like READ and REMOVE.
                   */
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>al=new ArrayList<Integer>();
        al.add(0, 10);
        al.add(1, 20);
        al.add(2, 30);
        al.add(3, 40);
        System.out.println("Iterate The ArrayList Element By Using Iterator ");
         Iterator<Integer>itr=al.iterator();
      /* hasNext():-  It returns true if there are more elements left in the iteration. 
    	 If there are no more elements left, then it will return false. */
         while(itr.hasNext())
         {
        	 /* It is similar to hasNext() method. It also does not accept any parameter. 
        	  * It returns E, i.e., the next element in the traversal. */
        	 Integer val=itr.next();
        	 System.out.println(val);
         }
         System.out.println("..............................................................");
         System.out.println();
         System.out.println("Iterate The ArrayList Element By Using Iterator ");
		ArrayList<String>sl=new ArrayList<String>();
		sl.add("Sangola");
		sl.add("Solapur");
		sl.add("Sangli");
		sl.add("Satara");
		Iterator<String>sitr=sl.iterator();
		while(sitr.hasNext())
		{
			String val1=sitr.next();
			System.out.println(val1);
		}
		 System.out.println("..............................................................");
         System.out.println();
         System.out.println("Iterate The ArrayList Element By Using Iterator ");
         ArrayList<Float>fl=new ArrayList<Float>();
         fl.add(10.4f);
         fl.add(7.8f);
         fl.add(3.6f);
         fl.add(12.3f);
         Iterator<Float>fitr=fl.iterator();
         System.out.println("Return The First Element : "+fitr.next());     //it display only first element    

         while(fitr.hasNext())
         {
        	 Float f=fitr.next();
        	System.out.println(f);//it display 2nd element to last element  
         }
		// remove() :- remove the odd numbers by using remove() and print the Even Numbers
         ArrayList<Integer>ali=new ArrayList<Integer>();
         ali.add(10);
         ali.add(5);
         ali.add(20);
         ali.add(13);
       Iterator<Integer>it=ali.iterator();
       while(it.hasNext())
       {
    	   Integer num=it.next();
    	   if(num%2!=0)
    	   {
    		   it.remove();
    	   }
       }
       System.out.println("Even Numbers :"+ali);
         
		
	}

}
