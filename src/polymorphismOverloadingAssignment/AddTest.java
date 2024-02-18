package polymorphismOverloadingAssignment;

public class AddTest
{
	public static void main(String[] args)
	{
		System.out.println("Q1.Overload method by changing data type of argument and keeping same number of argument");
		MethodOverloadingTest ob=new MethodOverloadingTest();
		ob.Add(10,20);
		ob.Add(10.2f,5.5f);
		//ob.Add("Pratiksha","Bhuse");
	}

}
