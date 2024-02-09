package arrayAssignment7;

public class SumEvenOddArrayNumber 
{
public static void main(String[] args)
{
	System.out.println("Q1.Write a Java program to find sum of even and odd number separately");
	int arr[]= {1,2,3,4,5,6,7};
	SumEvenOddArrayNumber obj=new SumEvenOddArrayNumber();
	obj.EvenSum(arr);
	obj.OddSum(arr);
}
     void EvenSum(int []arr)
     { 
    	 int sum=0;
         int Evenarr[] =new int[arr.length];
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 
    		 if(arr[i]%2==0)
    		 {
    			 Evenarr[i]=arr[i];
       		 sum=sum+Evenarr[i];
    		 } 
    	 }
    	 System.out.println("Sum Of Even Numbers:"+sum);
     }
     void OddSum(int []arr)
     {
    	 int sum=0;
    	 int oddArr[]=new int[arr.length];
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 if(arr[i]%2!=0)
    		 {
    			 oddArr[i] =arr[i];
    			 sum=sum+oddArr[i];
    		 }
    	 }
    	 System.out.println("Sum Of Odd Numbers:"+sum);
    	 
     }
}
