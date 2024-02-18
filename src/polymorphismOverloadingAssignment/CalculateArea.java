package polymorphismOverloadingAssignment;


public class CalculateArea 
{
 
	void Area(float r)
	{ 
    double pi=3.142;
    System.out.println("Area of Circle:"+(pi*r*r));
		
	}
	void Area(float l,float w)
	{
		System.out.println("Area of Rectangle:"+(l*w));
	}
	void Area(int b,float h)
	{
		float aot=(b*h)/2;
		System.out.println("Area of Triangle :"+aot);
	}
}
