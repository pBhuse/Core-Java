import java.util.Scanner;
public class PositiveOrNegativeTest
{
public static void main(String[] args)
{
	//System.out.println("Q4.=======Write a Java program to get a number from the user and print whether it is positive or negative =======");
	System.out.println("Q4.========Check the Number is positive or negative =======");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	if(num>0)
	{
		System.out.println(num+": Is positive");
	}
	else if(num<0)
	{
		System.out.println(num+":Is negative");
	}
	else
	{
		System.out.println(num+": Is equal to zero");
	}
}
}
