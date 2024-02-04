package arrayAdvanceAssignment6;

public class SecondLargestElementByUsingForLoop
{
public static void main(String[] args)
{    		int arr[]= {25,10,35,15,45};

	SecondLargestElementByUsingForLoop obj=new SecondLargestElementByUsingForLoop();
	obj.largestNumber(arr);
}
void largestNumber(int[]arr)
{
	System.out.println("Array Elements :");
	for (int i : arr)
	{
		System.out.print("\t "+i);
	}
	System.out.println();
	int tmp=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				 tmp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=tmp;
				
			}
		}
	}
	System.out.println("Second Largest Element Is:"+arr[arr.length-2]);

}
}
