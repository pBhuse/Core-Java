package polymorphismOverridingAssignment;


public class Cat extends Animal
{
	void printSound()
	{
   System.out.println(" Sound of Cat: Meoww Meoww......");
	
     }
	public static void main(String[] args) {
		   System.out.println("Q2.Implementation of method overriding :");
		Animal ob=new Cat();
		ob.printSound();
	}
}