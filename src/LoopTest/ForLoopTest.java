package LoopTest;

import java.util.Iterator;

public class ForLoopTest {

	public static void main(String[] args) {
		
		ForLoopTest ob=new ForLoopTest();
		ob.printTables();
		ob.printnumWhileLoop();
		ob.printnumDoWhileLoop();
		System.out.println("Print the number 1to 5");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		System.out.println(" print the number 5 to 1");
		for(int j=5;j>=1;j--)
		{
			System.out.println(j);
		}
		
	}
	void printTables()
	{
		System.out.println("print number 2,4,........,20");
		for(int i=2;i<=20;i=i+2)
		{
			System.out.println(i);
		}
		System.out.println("table using extra variable");
		int j=2;
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*j);
		}
		System.out.println("table using one variable");
		for(int i=2;i<=20;i=i+2)
		{
			System.out.println(i);
		}
		System.out.println("using modulus operator");
		for(int i=2;i<=20;i++)
		{
			if(i%2==0)
				System.out.println(i);
			
		}
		
		}
	void printnumWhileLoop()
	{
		int i=1;
		System.out.println("while lopp");
		while(i<=5)
		{
			System.out.println(i);
			i++;
		}
	}
	void printnumDoWhileLoop()
	{
		System.out.println("do-while lopp");

		int i=1;
		do
		{
		System.out.println(i);
			i++;
		}while(i<=5);
	}
		
	}

