package PrivateInnerClass;

public class OuterClass 
{
   int num=10;
   
   private class InnerClass
   {
	   void display()
	   {
		   System.out.println("This is  Inner class display method");
		   System.out.println("Num="+num);
	   }
//	   void show()
//	   {
//	   InnerClass ob=new InnerClass();
//	   
//	   ob.display();
//	   }
   }
   public static void main(String[] args) {
	 //  OuterClass ob1=new OuterClass();
	 //  ob1.show(); we can't directly access  inner class method 
	   OuterClass outer = new OuterClass();
	   OuterClass. InnerClass inner  = outer.new InnerClass();
	   inner.display();
	   
}
}
