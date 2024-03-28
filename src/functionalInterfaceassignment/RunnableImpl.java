package functionalInterfaceassignment;

public class RunnableImpl 
{
public static void main(String[] args)
{
	System.out.println("Q1.====== Implement Runnable Functional Interface By using Lambda Expression. ========");
	Runnable ob=()->System.out.println("Here Using Lambda Expression ");
ob.run();
}
}
