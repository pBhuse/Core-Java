package ProtectedInnerClass;

public class OuterClass
{
   protected class InnerClass
   {
	   void display()
	   {
		   System.out.println("This is Inner class method");
	   }
//	   void displayMethod()
//	   {
//		   InnerClass inner= new InnerClass();
//		   inner.display();
//	   }
   }
   void show()
   {
	   System.out.println("This is Outer class method");
   }
   public static void main(String[] args)
   {
	   OuterClass ob=new OuterClass();
	   OuterClass.InnerClass inner=ob.new InnerClass();
	  inner.display();
	  ob.show();
	   
}
}
