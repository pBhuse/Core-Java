package polymorphismOverridingAssignment;


public class Dog extends Animal
{
		void printSound()
		{
	 System.out.println(" Sound of Dog: woof woof......");

		}
		public static void main(String[] args)
		{ 		   System.out.println("Q2.Implementation of method overriding :");
			Animal ob1=new Dog();
			ob1.printSound();
			
		}
}