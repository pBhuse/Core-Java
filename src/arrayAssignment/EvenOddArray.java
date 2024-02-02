package arrayAssignment;
import java.util.Scanner;
public class EvenOddArray
{
public static void main(String[] args) 
{
	System.out.println("Q3.===W.A.P to find the number of even and odd integers in a given array of integers.===");
	
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];
    int arrEven[]=new int[10];
    int arrOdd[]=new int[10];
    System.out.print("Enter array Elements:");
    for(int i=0;i<arr.length;i++)
    {
    	arr[i]=sc.nextInt();
    	
    }
    System.out.println(" Array Elements Are :");
    for(int i=0;i<arr.length;i++)
    {
    	System.out.print("\t"+arr[i]);
    }
    System.out.println();
    System.out.println("Even Array Elements:");
    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i]%2==0)
    	{
    		arrEven[i]=arr[i];
        	System.out.print("\t "+arrEven[i]);


    	}
    }
    System.out.println();
	System.out.println("Odd Array Elements:");    	

    for(int i=0;i<arr.length;i++)
    {
    	if(arr[i]%2!=0)
    	{

    		 arrOdd[i]=arr[i];
    	        System.out.print("\t"+arrOdd[i]);

    	}

    	}
    }
}

