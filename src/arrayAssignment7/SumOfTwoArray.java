package arrayAssignment7;

public class SumOfTwoArray
{
public static void main(String[] args) 
{
	System.out.println("Q2.Create two arrays with same no of integer element and create third array which contains sum of two arrays" );
	int Array1[]= {1,2,3,4,5,6,7};
	int Array2[]= {0,0,2,1,3,5,2};
	int Array3[]=new int[Array1.length];
	int sum=0;
	System.out.println("sum of two arrays:");
	for (int i = 0; i < Array1.length; i++)
	{

		Array3[i]=Array1[i]+Array2[i];
		System.out.print("\t"+Array3[i]);
	
	}
}
}
