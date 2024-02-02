

public class ReverseArrayElementInDifferentArray
{
public static void main(String[] args) 
{
	int arr[]= {10,20,30,40};
	ReverseArrayElementInDifferentArray ob=new ReverseArrayElementInDifferentArray();
	ob.reverseArrayElement(arr);
}
void reverseArrayElement(int[]arr)
{
	System.out.println("Reverse Array Elements :");
	int arr2[]=new int[arr.length];
	int j=0;
	for(int i=arr.length-1;i>=0;i--)
	{
		int val=arr[i];
		arr2[j]=val;
		j++;
	}
	for (int i : arr2) {
		System.out.println(i);
	}
}
}
