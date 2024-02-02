package arrayAssignment;

public class ArrayMaxElement
{

	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5};
		
		int arrMax = arr[0];//        //Initialize max with first element of array.  

		System.out.println("Max Element in  given array");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>arrMax)
			{
				arrMax=arr[i];
			}
			}
		System.out.println(arrMax);
		}
}
