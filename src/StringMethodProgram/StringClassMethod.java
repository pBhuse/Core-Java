package StringMethodProgram;

public class StringClassMethod 
{
public static void main(String[] args) 
{
	System.out.println("**********Implementation of String Class Methods********* ");
	System.out.println(" 1. String Concatenation ");
	String s="Delhi";
	s=s.concat("Mumbai");
	System.out.println(s);
	System.out.println();
	System.out.println("2.subString(int startIndex)");
	String sr=s.substring(5);
	System.out.println(sr);
	System.out.println();
	System.out.println("3.subString(int startIndex,int endIndex)");
    String str="Box is heavy";
    System.out.println("Given string :"+str);
    String str1=str.substring(7, 12);
    System.out.println(str1);
    System.out.println();
    String p="Hello";
    System.out.println("4. toUpperCase()");
    System.out.println("Given string :"+p);
    String m=p.toUpperCase();
    System.out.println(m);
    System.out.println();
    System.out.println("5.toLowerCase()");
    String n="BOX";
    System.out.println("Given String :"+n);
    String a=n.toLowerCase();
    System.out.println(a);
    System.out.println();
    System.out.println(" 6.trim()");
    String d=" hello  ";
    System.out.println("Given String :"+d);
    String q=d.trim();
    System.out.println(q);
    System.out.println();
    System.out.println("7.length()");
    String g="box is heavy";
    System.out.println("Given String : "+g);
    int w=g.length();
    System.out.println("Length of String :"+w);
    System.out.println();
    System.out.println("8.equals()");
    String str2="Sangola";
    String Str3="sangola";
    System.out.println("first String :"+str2);
    System.out.println("second String :"+Str3);
    boolean str4=str2.equals(Str3);
    if(str4==true)
    {
    	System.out.println("strings are equal");
    }
    
    else
    {
    	System.out.println("Strings are not equal");
    }
    
    System.out.println();
    System.out.println("9. equalIngoreCase()");
    System.out.println(" first String:"+str2);
    System.out.println("second String:"+Str3);
    boolean str5=str2.equalsIgnoreCase(Str3);
    if(str5==true)
    {
    	System.out.println("String are equal by using  equalIngoreCase()");
    }
    else
    {
    	System.out.println("String are not equal by using  equalIngoreCase()");

    }
    System.out.println();
    System.out.println("10.compareTo()");
    System.out.println("first String :"+str2);
    System.out.println("second String:"+Str3);
    int l=str2.compareTo(Str3);
    if(l==0)
    {
    	System.out.println("Both Strings are equal ");
    }
    else if(l>0)
    {
    	System.out.println("First String is Greater");
    }
    else
    {
    	System.out.println("Second String is greater");
    }
   System.out.println();
   System.out.println("11.compareToIgnoreCase()");
   System.out.println("first String :"+str2);
   System.out.println("second String:"+Str3);
   int l1=str2.compareToIgnoreCase(Str3);
   if(l1==0)
   {
   	System.out.println("Both Strings are equal by using compareToIgnoreCase() ");
   }
   else if(l1>0)
   {
   	System.out.println("First String is Greater by  using compareToIgnoreCase()");
   }
   else
   {
   	System.out.println("Second String is greater by  using compareToIgnoreCase()");
   }
     System.out.println();
     System.out.println("12.startWith()");
     String str6="This is String class Method";
     String str7="This";
     System.out.println("First String :"+str6);
     System.out.println("Second String :"+str7);
     boolean b=str6.startsWith(str7);
     if(b==true)
     {
    	 System.out.println(" first String start with Second String ");
     }
     else
     {
    	 System.out.println(" first String not  start with Second String ");
 
     }
     
     System.out.println();
     System.out.println("13.endsWith()");
     String str8="function";
     System.out.println("First String :"+str6);
     System.out.println("Second String :"+str8);
     boolean b1=str6.endsWith(str8);
     if(b1==true)
     {
    	 System.out.println("First string ends with second String");
     }
     else
     {
    	 System.out.println("First string not ends with second String");

     }
    
     System.out.println();
     System.out.println("14.chartAt()");
     String str9="Sangola";
     System.out.println("Given String"+str9);
     char ch=str9.charAt(3);
     System.out.println(ch);
     System.out.println();
     System.out.println("15.indexOf()");
     String str10="Java is a object oriented programming language. java is a platform independent.";
     int i=str10.indexOf("is");
     if(i<0)
     {
    	 System.out.println("substring not found");
     }
     else
     {
    	 System.out.println("substring found at ="+i);
     }

     System.out.println();
     System.out.println("16.lastIndexOf()");

     int j=str10.lastIndexOf("is");
     if(j<0)
     {
    	 System.out.println("substring not found");
     }
     else
     {
    	 System.out.println("substring found at ="+j);
     }
      System.out.println();
    System.out.println("17.getChars()"); 
    String  str11="java is robust language";
    char[]ar=new char[str11.length()];
    str11.getChars(5, 15, ar, 0);
    for (char c : ar)
    {
		System.out.print(c);
	}
    System.out.println();
    System.out.println("18.replace()");
    String str12="This is method";
    String replaceString=str12.replace("method", "function");
    System.out.println(replaceString);
    
    
}
	
	
}
