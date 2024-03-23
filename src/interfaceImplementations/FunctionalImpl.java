package interfaceImplementations;

public class FunctionalImpl
{

	public static void main(String[] args)
	{
		//functional interface contain single abstract method
		//lambdas can only written for functional interface
		FunctionalInterface ob=new FunctionalInterface()
				{
                 //Anonymous class:- does not have a name 
					@Override
					public void hello() {
               System.out.println(" from hello");						
					}
			
				};
				
				ob.hello();
	}
}
