package arrayAssignment;

public class ArraySum {
public static void main(String[] args) {
	System.out.println("Q1.===Write a Java program to sum values of an array===.");
	//int[]arr1=new int[5];//Array declaration and initialization
	int[]arr1= {10,20,30,40,50};
	int sum=0;
	System.out.println("Array Elements are:");
	for(int i=0;i<arr1.length;i++)//Retrieve the array element
	{
		System.out.println(" "+arr1[i]);
	}
	//Sum of array element
	for(int j=0;j<=arr1.length-1;j++)
	{
		sum=sum+arr1[j];
	}
	System.out.println("Sum of array Elements:"+sum);
}
	
}
