package polymorphismOverridingAssignment;


 public class Pig extends Animal
{
		void printSound()
		{
	 System.out.println(" Sound of Pig: oink......");

		}
		public static void main(String[] args) {
	System.out.println("Q2.Implementation of method overriding :");
			Animal ob2=new Pig();
			ob2.printSound();
			
		}
}