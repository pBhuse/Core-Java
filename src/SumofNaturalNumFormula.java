import java.util.Scanner;
public class SumofNaturalNumFormula
{
public static void main(String[] args)
{
	System.out.println("Q6.=====Sum of Natural Number using (sum=n*(n+1)/2) =======");
	Scanner sc=new Scanner(System.in);
	int n;
	//System.out.println("Enter the First number");
    //int a=sc.nextInt();
	//System.out.println("Enter the Difference between Two numbers");
	//int d=sc.nextInt();
	//int sum = n/2*(2*a +(n - 1)*d);// use  if last digit is even 
	System.out.println("Enter the Last number");
	n=sc.nextInt();
	int sum=n*(n+1)/2;
	System.out.println("Sum Of Natural Numbers=:"+sum);
	
}
}
