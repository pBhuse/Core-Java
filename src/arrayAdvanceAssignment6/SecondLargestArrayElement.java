package arrayAdvanceAssignment6;

import java.util.Arrays;

public class SecondLargestArrayElement
{
public static void main(String[] args)
{
	System.out.println("Q1.W.A.P to find Second Largest Number in Array .");
	int arr[]= {25,10,35,15,45};
	SecondLargestArrayElement obj=new SecondLargestArrayElement();
	obj.largestElement(arr);
}
	void largestElement(int arr[])
	{
		System.out.println("Array Elements:");
		for (int i : arr) {
			System.out.print("\t"+i);
		}
		System.out.println();
		Arrays.sort(arr);
		{
			System.out.println("Second Largest Array Element is:"+" "+arr[arr.length-2]);
		}
	}
}
