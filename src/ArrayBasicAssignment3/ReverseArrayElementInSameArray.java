package ArrayBasicAssignment3;

public class ReverseArrayElementInSameArray
{
public static void main(String[] args) 
{
	ReverseArrayElementInSameArray ob=new ReverseArrayElementInSameArray();
	int arr[]= {10,20,30,40};
	ob.ReverseArray(arr);
	
}
void ReverseArray(int[]arr)
{
	int index=arr.length-1;
	for(int i=0;i<(arr.length/2);i++)
	{
		int val=arr[i];
		arr[i]=arr[index];
		arr[index]=val;
		index--;
	}
	for (int i : arr)
	{
		System.out.println(i);
	}
}
}
