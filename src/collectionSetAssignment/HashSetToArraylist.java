package collectionSetAssignment;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetToArraylist
{
public static void main(String[] args)
{
   System.out.println("4] Write a Java program to convert a hash set to a List/ArrayList");
HashSet<Integer>hs=new HashSet<Integer>();
hs.add(10);
hs.add(20);
hs.add(30);
hs.add(40);
hs.add(50);
System.out.println("HashSet elements:"+hs);

ArrayList<Integer>al=new ArrayList<Integer>(hs);
System.out.println(" All elements from hashset to ArrayList :"+al);


}
}
