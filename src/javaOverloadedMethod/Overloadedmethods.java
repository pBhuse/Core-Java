package javaOverloadedMethod;

public class Overloadedmethods 
{
	public static void main(String[] args) 
	{
		//1. println() : It is an overloaded method of the printStream class.
	   System.out.println("hello world");
	   System.out.println(42);
	   //2.valueOf()-(String class) :it convert different data type value to string.
	   String s1=String.valueOf(123);
	   System.out.println(s1);
	   String s2=String.valueOf(true);
	   System.out.println(s2);
	//3.append()-(StringBuilder class):it overload  for different data types when building string.
	   StringBuilder sb=new StringBuilder("hello");
	   sb.append("world");
	   sb.append(42);
	   System.out.println(sb);
	  //4. print()-(System class):overloaded for printing different data types to the console.
	   System.out.print("hello");
	   System.out.print(42);
	   // 5.parseInt()-Integer class:overloaded for parsing  Integer from different inputs.
	  System.out.println();
	   String s= new String("f");
//      int r=Integer.parseInt(s);
//	   System.out.println(r);
	   
       int m=Integer.parseInt(s,16);
        System.out.println("Run :"+m);
	   
	}
}
