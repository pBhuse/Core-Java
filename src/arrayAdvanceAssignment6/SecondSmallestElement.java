package arrayAdvanceAssignment6;

import java.util.Arrays;

public class SecondSmallestElement
{
 public static void main(String[] args)
 {
	 System.out.println("Q1.W.A.P to find Second Smallest Number in Array .");
		int arr[]= {25,10,35,15,45};
		SecondSmallestElement obj=new SecondSmallestElement();
		obj.smallestElement(arr);
	}
		void smallestElement(int arr[])
		{
			System.out.println("Array Elements:");
			for (int i : arr) {
				System.out.print("\t"+i);
			}
			System.out.println();
			Arrays.sort(arr);
			{
				System.out.println("Second Smallest Array Element is:"+" "+arr[1]);
			}
}
}
