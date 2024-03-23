package interfaceImplementations;

public interface Greetings
{
	void hello();//by default public and abstract
	public abstract void hello1();
	public default void greetings()
	{
         System.out.println("Inside the greetings method");
     }
	static void greeting_static()
	{
        System.out.println("Inside the greeting static methods");

	}
}