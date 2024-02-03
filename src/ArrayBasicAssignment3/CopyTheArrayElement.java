package ArrayBasicAssignment3;

public class CopyTheArrayElement 
{
public static void main(String[] args) 
{
	System.out.println("Q2...Copy All elements of one array into another array...");
	int arr1[]= {3,5,7,9};
	int arr2[]= new int[arr1.length];
	System.out.println("Array Elements in arr1 :-");
	for(int i=0;i<arr1.length;i++)
	{
		int p=arr1[i];
		System.out.print("\t"+p);
	}
	System.out.println();
	System.out.println("Copied  Array Elements in arr2 :-");
	for(int i=0;i<arr1.length;i++)
	{
		arr2[i]=arr1[i];
	System.out.print("\t"+arr2[i]);
	}
	 
	
}
}
