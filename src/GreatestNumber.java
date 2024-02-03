import java.util.Scanner;
public class GreatestNumber 
{
public static void main(String[] args)
{
	System.out.println(" Q1.=========Take two int values from user and print greatest among them ========");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Two Numbers");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	if(num1>num2)
	{
		System.out.println(num1+" Is Greater");
	}
	else
	{
		System.out.println(num2+" Is Greater");
	}
}
}
