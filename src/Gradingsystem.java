import java.util.Scanner;
public class Gradingsystem 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println(" Q2.========school grade system========");
	System.out.println(" Enter The Marks");
	float marks;
	marks=sc.nextFloat();
	
	
//	a. Below 25 – F b. 25 to 45 – E c. 45 to 50 – D d. 50 to 60 – C e. 60 to 80 - B
//	f. Above 80 - A
	
	if(marks<=25)
	{
		System.out.println(" F Grade");
	}
	else if(marks>25 && marks<=45)
	{
		System.out.println(" E Grade");
	}
	else if(marks>45 && marks<=50)
	{
		System.out.println(" D Grade");
	}
	else if(marks>50 && marks<=60)
	{
		System.out.println(" C Grade");
	}
	else if(marks>60 && marks<=80)
	{
		System.out.println(" B Grade");
		
	}
	else if(marks>80)
	{
		System.out.println(" A Grade");
	}
	else
	{
		System.out.println(" Invalid Input");
	}
	}
}
