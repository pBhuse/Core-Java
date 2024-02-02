package ArrayBacicAssignment4;

import java.util.Scanner;

public class ArrayAscending
{

	public static void main(String[] args)
	{
		System.out.println("Q1.Given an array arr[] of size N, the task is to sort this array in ascending order in Java");
		System.out.println();
		int [] arr= {0,23,14,12,9};
		ArrayAscending obj=new ArrayAscending();
		  obj.ArrayAsending(arr);
		  int arr2[]=new int[3];
		  obj.userArray(arr2);
		  obj.userArrayAscending(arr2);
		  
	}
      
	void ArrayAsending(int[] arr) {
		
		System.out.print("Given Array Elements:-");
		
		for (int i = 0; i <arr.length; i++) {
			System.out.print("\t"+arr[i]);
			
		}
		System.out.println();
		System.out.println();

		System.out.print("Asending Array Elements:-");
		//int arr2[]=new int[arr.length-1];
		int tmp=0;
		int i,j;
		for ( i = 0; i <arr.length; i++) {
			for ( j = i+1; j <arr.length; j++) {
			if(arr[i]>arr[j])
			{
			 tmp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=tmp;
			}
			
		}
			System.out.print("\t"+arr[i]);
		}
	
	}
	void userArray(int[]arr2)
	{		System.out.println();

		System.out.println();
		System.out.println(" Enter The Array Elements:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
			
		}
		
	}
	void userArrayAscending(int[]arr2)
	{ 
		System.out.println();
		System.out.print("Ascending Array Elements Are:-");
		int temp=0;
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=i+1;j<arr2.length;j++)
			{
				if(arr2[i]>arr2[j])
				{
					temp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
				}
			}
			System.out.print("\t"+arr2[i]);
		}
	}

}