package ImplementationOfConstructor;

public class Rectangle 
{
final float l;
final float w;
float area;
 Rectangle(float l,float w)
{
	 this.l=l;
	 this.w=w;
}
Rectangle(Rectangle r)
{
	
	 this.l = 0;
	this.w = 0;
	area=r.l*r.w;
   System.out.println("Area:"+area);
	
}
public static void main(String[] args) 
{
	Rectangle ob1=new Rectangle(1.2f,2.2f);
	Rectangle ob2=new Rectangle(ob1);


	
}

}
