package arrayAdvanceAssignment6;

public class SecondSmallestElementUsingForLoop 
{
public static void main(String[] args)
{
	int arr[]= {25,10,35,15,45};
	SecondSmallestElementUsingForLoop obj=new SecondSmallestElementUsingForLoop();
	obj.smallestElement(arr);
}
void smallestElement(int[]arr)
{
	System.out.println("Array Elements :");
	for (int i : arr)
	{
		System.out.print("\t"+i);
	}
	int tmp=0;
	System.out.println();
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			}
		}
	}
	//int m=arr[1];
	System.out.println("Second Smallest Number is :"+arr[arr.length-2]);
}
}
