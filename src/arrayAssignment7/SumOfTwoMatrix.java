package arrayAssignment7;

public class SumOfTwoMatrix 
{
public static void main(String[] args) 
{ System.out.println("Q.write a Java Program to add two given Matrices");
	int Array1[][]= {{3,4},{2,9},{7,6}};
	int Array2[][]= {{1,2},{3,4},{5,6}};
	int Array3[][]=new int[3][2];
	System.out.println("Sum of Two matrix:");
	for( int i=0;i<3;i++)//rows
	{
		for(int j=0;j<2;j++)//column
		{
		Array3[i][j]=Array1[i][j] + Array2[i][j];
		System.out.print("\t"+Array3[i][j]);

		}
	}
}
}
