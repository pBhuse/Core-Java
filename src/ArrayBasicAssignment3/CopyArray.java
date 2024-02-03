package ArrayBasicAssignment3;

public class CopyArray
{
	public static void main(String[] args)
	{
		System.out.println("Q2...Copy All elements of one array into another array...");
         int arr[]= {10,20,30,40,50};
         CopyArray ob=new CopyArray();
         ob.copyArrayElement(arr);
	}
   void copyArrayElement(int[]arr)
   {
	   System.out.println("Copied Array Element in Given Array");
	   
	   int arr2[]=new int[arr.length];
	   for(int i=0;i<arr.length;i++)
	   {
		   int val=arr[i];
		   arr2[i]=val;
		   System.out.println(arr2[i]);

	   }
   }
}
