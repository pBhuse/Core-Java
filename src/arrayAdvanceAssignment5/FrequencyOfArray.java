package arrayAdvanceAssignment5;

import java.util.Arrays;
import java.util.Iterator;
public class FrequencyOfArray 
{
public static void main(String[] args)
{
  System.out.println("W.A.P to count the frequency of each element in array.");
	  int arr[]= {2,2,3,4,3,4,2};

  FrequencyOfArray ob=new FrequencyOfArray();
	  ob.frequency(arr);
}
void frequency(int[]arr)
{
	Arrays.sort(arr);//built in methods of array class
	for(int i=0;i<arr.length;i++)
	{
		int count=1;
		if(i!=arr.length-1)//last element will not compare with other element that's why we  use i!=arr.length-1
		{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
			}
			else
			{
				break;
			}
		}}
		System.out.println("Array element :"+arr[i]+" And his Frequency is:"+count);
		i+=count-1;//other loop increment  i value and it goes to last  element of counts
	}
}
}
