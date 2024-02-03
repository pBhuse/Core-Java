import java.util.Scanner;
public class LowercaseOrUppercaseChracter
{
public static void main(String[] args) 
{
	System.out.println(" Q3.====== To check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z)======= ");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Character");
	char ch=sc.next().charAt(0);
	int Asciivalue1=ch;
	//or Asciivalue1=(int)ch;i.e type casting
	if(Asciivalue1>=97 && Asciivalue1<=122)
	{
		System.out.println(ch+" :entered character is in Lowercase");
	}
	else if(Asciivalue1>=65 && Asciivalue1<=90)
	{
		System.out.println(ch+" :entered character is in Uppercase");

	}
	else
	{
		System.out.println("Invalid Input");
	}
}
}
