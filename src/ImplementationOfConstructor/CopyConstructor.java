package ImplementationOfConstructor;

public class CopyConstructor
{
	float l,w,area;
	
   CopyConstructor(float l,float w)
   {
	   this.l=l;
		this.w=w;
	   
   }
	CopyConstructor(CopyConstructor c)
	{
		
		 area=c.l*c.w;
	}
	void display()
	{
		
		System.out.println("Area of rectangle :"+area);
	}
	public static void main(String[] args)
	{
		CopyConstructor ob=new CopyConstructor(4.2f,2.2f);
		CopyConstructor ob1=new CopyConstructor(ob);
		ob1.display();
		
		
	}
	
}
