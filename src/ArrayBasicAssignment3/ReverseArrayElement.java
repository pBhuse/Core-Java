package ArrayBasicAssignment3;

public class ReverseArrayElement {
public static void main(String[] args) 
{
	System.out.println("Q3....WAP To Reverse the  Array...");
	int arr[]= {10,20,30,40};
	System.out.println("Array Elements :-");
	for(int i=0;i<arr.length;i++)
	{
		int p=arr[i];
		System.out.print("\t"+p);
	}
	System.out.println();
	System.out.println("Reversed Array Elements:-");
for(int i=arr.length-1;i>=0;i--)
{
	int a=arr[i];
	System.out.print("\t"+a);
}
}
}
