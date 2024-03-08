package assignment1_StringBasic;

public class ReverseString
{
 
	public static void main(String[] args)
	{
		System.out.println("Q1. write a java program to reverse a string without using in-built methods");
		String str="MyJava";
		
		int l=str.length();
		char[]ch=str.toCharArray();
		System.out.println("Given String : "+str);
		System.out.println("Reversed String:");
		for(int i=l-1;i>=0;i--)
		{
			char[]ch1=new char[l];

			ch1[i]=ch[i];
			System.out.print(ch1[i]);
			
		}
		
	}
}
