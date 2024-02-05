package ImplementationOfConstructor;

public class DefaultConstructor
{
	float length;
	float width;
	public static void main(String[] args)
	{
		DefaultConstructor ob=new DefaultConstructor();
        ob.areaOFRectangle();
	}
	DefaultConstructor()
	{
		length=5.2f;
		 width=10.5f;
	}
	void areaOFRectangle()
	{
		float aor=length*width;
		System.out.println("Area of Rectangle:- "+aor);
	}
}
