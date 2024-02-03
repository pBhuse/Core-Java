import java.util.Scanner;
public class SumOfNaturalNumInForLoop
{
 public static void main(String[] args)
 {
	 System.out.println("Q5.======Sum of Natural Numbers using For Loop======");
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the last Number");
	int num=sc.nextInt();
	for(int i=1;i<=num;i++)
	{
		sum=sum+i;
		
	}
	System.out.println("Sum of Natural=:"+sum);
}
}
