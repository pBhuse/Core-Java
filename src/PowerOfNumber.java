import java.util.Scanner;
public class PowerOfNumber {
public static void main(String[] args) {
	System.out.println("Q7.========Calculate Power of Numbers======");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int a=sc.nextInt();
	System.out.println("Enter the exponent");
	int b=sc.nextInt();
	double result=Math.pow(a,b);//integers are only 32 bits. This means that its max value is 2^31 -1. As you see, for very small numbers, you quickly have a result which can't be represented by an integer anymore. That's why Math.pow uses double.
	System.out.println("Power of number=: "+result);
	/*
	         long result = 1;
             for (int i = 1; i <= b; i++) 
             {
              result *= a;
              }
	 System.out.println("Power of number=: "+result);
	 */
	  
	  
}
}
