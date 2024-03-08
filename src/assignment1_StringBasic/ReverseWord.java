package assignment1_StringBasic;

public class ReverseWord
{

	public static void main(String[] args) 
	{
		String s="Java Concept Of The Day";
		String[] s1=s.split(" ");		
		char[]ch=s.toCharArray();
		String str="";
		char[]ch2=new char[ch.length];
		int len=ch.length;
		System.out.println("Given String :"+s);
		
		
		//reverse the word:- Day The Of Concept Java
		for(int i=s1.length-1;i>=0;i--)
		{
			
			
			System.out.print(" "+s1[i]);
		}
		System.out.println();
		//2.reverse the word and each character of the word
				//eg.yaD ehT fO tpecnoC avaJ
		for(int i=len-1;i>=0;i--)
		{
		
			System.out.print(ch[i]);
		}
		
		
		System.out.println();
		System.out.println("Q3.Reverse the Each word Of A String In Java");

		System.out.println("Reverse word :");
		for(int i=0;i<s1.length;i++)
		{
			String st=s1[i];
			String revWord="";
			for(int j=st.length()-1;j>=0;j--)
			{
				revWord=revWord+st.charAt(j);
			}
			System.out.print(" "+revWord);
			System.out.println();

		}
	}
}
