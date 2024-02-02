package arrayAssignment;
import java.util.Scanner;
public class AverageOfArray
{
public static void main(String[] args) 
{
	System.out.println("Q2.===Write a Java program to calculate the average value of array elements.==");
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	//int arr[]= {10,30,20,40,50};
	System.out.println("Enter the Array element");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
    }
	System.out.println("Array Elements Are:");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	System.out.println("Sum of Array Elements:");
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
	System.out.println(sum);
	System.out.println("Average Of array:");
	int averageArray=sum/arr.length;
	System.out.println(averageArray);
}
}
