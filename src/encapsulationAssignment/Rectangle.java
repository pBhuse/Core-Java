package encapsulationAssignment;

public class Rectangle
{
	//Problem :- Design A Encapsulated Rectangle Class that should work for below method(getter and setter method)?

	private int Length;
	  private int Breadth;
	
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		this.Length = length;
	}
	public int getBreadth() {
		return Breadth;
	}
	public void setBreadth(int breadth) {
		this.Breadth = breadth;
	}
	public Rectangle(int Length,int Breadth)
	{
		
		this.Length=Length;
		this.Breadth=Breadth;
	   int Area=Length*Breadth;
	   System.out.println("Area: " +Area); 

	}

}
