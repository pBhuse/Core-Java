package arrayAssignment;
import java.util.Scanner;
public class ArrayMinElement 
{
public static void main(String[] args)
{
	int arr[]=new int[10];
	Scanner sc=new Scanner(System.in);
	int minElement=arr[0];
	System.out.print("Enter the Array Element");
	
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Array Elements are:");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print("\t"+arr[i]);
	}
	System.out.println();
	System.out.println("Minimum Element in the Array");
	for(int i=0;i<arr.length;i++)
	{
		
		if(arr[i]<minElement)
		{
			minElement=arr[i];
		}
	}
	System.out.println(minElement);
}	
}
