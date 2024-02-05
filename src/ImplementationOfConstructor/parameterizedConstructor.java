package ImplementationOfConstructor;

public class parameterizedConstructor
{
	float length,width;
public static void main(String[] args)
{
	parameterizedConstructor ob=new parameterizedConstructor(5.5f,6.2f);
	ob.areaOfRectangle();
}
parameterizedConstructor(float len,float wid)
{
	length=len;
	width=wid;
}

void areaOfRectangle()
{
	System.out.println("Area of Rectangle :- "+(length*width));
}
}
