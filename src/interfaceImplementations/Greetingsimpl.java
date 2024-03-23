package interfaceImplementations;

public  class Greetingsimpl  implements Greetings
{
 public void hello()
{
	System.out.println("Inside the hello method");
}
 public void hello1()
 {
		System.out.println("Inside the hello1 method");

 }


 public static void main(String[] args) 
 {
	 Greetings  obj=new Greetingsimpl();//object of class Greetingsimpl and give the reference of Greetings  interface . 
	 obj.greetings();// using features of default method interface.
	 Greetings.greeting_static();// using features of static method of interface.
}
}
