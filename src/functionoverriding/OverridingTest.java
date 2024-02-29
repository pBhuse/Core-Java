package functionoverriding;

 class Animal
{
void move()
{
	System.out.println("Animal can moves");
}
}	
 class Dog extends Animal
{
	void move()
	{
		System.out.println("Dog can walk and Run");
	}
}
 public class OverridingTest
{
	public static void main(String[] args)
	{
		Animal ob1=new Animal();
		ob1.move();
		Animal ob=new Dog();//reference variable of Animal class and  object of Dog class
		ob.move();
		
		
	}
}

	
	

