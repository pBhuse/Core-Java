package polymorphismOverloadingAssignment;

public class AreaTest 
{
public static void main(String[] args)
{
	System.out.println("Q2. Calculate area of Circle, Triangle, Rectangle using method overloading.");
	CalculateArea ob=new CalculateArea();
	ob.Area(1.5f);
	ob.Area(1.2f,1.2f);
	ob.Area(3, 1.5f);
}
}
