package StringMethodProgram;

import java.util.Scanner;

public class StringHandsOnAssignment 
{
public static void main(String[] args)
{
	//Q1.Find total number of words  in given String
	String str="Good Evening";
	String[] st=str.split(" ");
	System.out.println("Given String :"+str);
	System.out.println("Total Number of words are:"+st.length);
	//Q2. count the total number of character in given string
	String str1="java language";
	int totalchar=0;
	for (int i = 0; i < str1.length(); i++) 
	{
		
        if(str1.charAt(i) != ' ')    
        {
			totalchar++;
        }
	}
	System.out.println("Total Number of characters are:"+totalchar);
	 //Q3.Count the number of spaces between words in a string 
	String str2="i am learning The java language";
	int totalspace=0;
	for (int i = 0; i < str2.length(); i++) 
	{
		
        if(str2.charAt(i)== ' ')    
        {
			totalspace++;
        }
	}
	System.out.println("Number of spaces :"+totalspace);
	// Q4.How To Convert Char To String By using toString() 
	char ch='A';
	String s=Character.toString(ch);
	System.out.println("String is :"+s);
	// Q4.How To Convert Char To String By using valueOf() 
     char chr='p';
     String s1=String.valueOf(chr);
     System.out.println("String is :"+s1);
 	// Q5.How To Convert String To Char By using charAt()
     String s2="Hello";
     for(int i=0;i<s2.length();i++)
     {
    	 char ch1=s2.charAt(i);
    	 System.out.println("Character at :"+i+" Position: "+ch1);
     }
    //Q6. to find  duplicate character in a string
     String s3="character";
     char[]charr=s3.toCharArray();
     System.out.println("Duplicate characters :");
     System.out.println("Given String :"+s3);
     for(int i=0;i<charr.length;i++)
     {
    	 for(int j=i+1;j<charr.length;j++)
    	 {
    		 if(charr[i]==charr[j])
    		 {
    			 System.out.println(charr[j]);
    			 break; 
    		 }
    		 
    	 }
     }
     //Q7.To check the string is palindrome or not
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The String ");
       String inputString=sc.nextLine();
       String revString="";
       for(int i=inputString.length()-1;i>=0;i--)
       {
    	   revString=revString+inputString.charAt(i);
       }
       if(inputString.equals(revString))
       {
    System.out.println(inputString+" String is  palindrome");	   
     
       }
       else
       {
    	    System.out.println(inputString+" String is not  palindrome");	   

       }
   	
		
}
}