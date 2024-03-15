package JavaCollectionsProgram;

import java.util.ArrayList;

public class ArrayListProgram1
{
public static void main(String[] args)
{
	ArrayList <Integer>al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	// display the 0th index element :-System.out.println(al.get(0));
	System.out.println("Iterate The ArrayList Element By Using For Loop: ");
	for (int i = 0; i < al.size(); i++) 
	{
		System.out.print("\t"+al.get(i));
	}
	System.out.println();
	System.out.println("Iterate The ArrayList Element By Using forEach Loop:");
	for (Integer integer : al)
	{
		System.out.print("\t"+integer);
		
	}
	System.out.println();
	System.out.println("Iterate The ArrayList Element By Using While Loop:");
	int j=0;
	while(j<al.size())
	{
		System.out.print("\t"+al.get(j));
		j++;
	}	System.out.println();
	System.out.println("...............................................................");
	ArrayList<String>sl=new ArrayList<String>();
	sl.add("Sangola");
	sl.add("Solapur");
	sl.add("Pune");
	sl.add("Mumbai");
	System.out.println("Iterate The ArrayList Element By Using For Loop: ");
for (int i = 0; i < sl.size(); i++)
{
	System.out.print("\t"+sl.get(i));
}
System.out.println();
System.out.println("Iterate The ArrayList Element By Using forEach Loop:");
for (String string : sl)
{
	System.out.print("\t"+string);
}
System.out.println();
System.out.println("Iterate The ArrayList Element By Using While Loop:");
int m=0;
while(m<al.size())
{
	System.out.print("\t"+sl.get(m));
	m++;
}System.out.println();
System.out.println("...............................................................");
ArrayList<Float>fl=new ArrayList<Float>();
fl.add(5.6f);
fl.add(8.9f);
fl.add(4.5f);
fl.add(3.4f);
System.out.println("Iterate The ArrayList Element By Using For Loop: ");
for(int i=0;i<fl.size();i++)
{
	System.out.print("\t"+fl.get(i));
}
System.out.println();
System.out.println("Iterate The ArrayList Element By Using forEach Loop:");
for(Float f:fl)
{
	System.out.print("\t"+f);
}
System.out.println();
System.out.println("Iterate The ArrayList Element By Using While Loop:");
int n=0;
while(n<sl.size())
{
	System.out.print("\t"+fl.get(n));
	n++;
}
System.out.println();
System.out.println("...............................................................");

ArrayList<Boolean>bl=new ArrayList<Boolean>();
bl.add(true);
bl.add(false);
System.out.println("Iterate The ArrayList Element By Using For Loop: ");
for(int i=0;i<bl.size();i++)
{
	System.out.print("\t"+bl.get(i));
}
System.out.println();
System.out.println("Iterate The ArrayList Element By Using forEach Loop:");
for(Boolean b :bl)
{
	System.out.print("\t"+b);
}System.out.println();
System.out.println("Iterate The ArrayList Element By Using While Loop:");
int k=0;
while(k<bl.size())
{
	System.out.print("\t"+bl.get(k));
	k++;
}

}
}
