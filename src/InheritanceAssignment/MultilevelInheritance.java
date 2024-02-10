package InheritanceAssignment;

public class MultilevelInheritance 
{
public static void main(String[] args)
{ 
	System.out.println("Q2. Write a simple program to implement multilevel inheritance.");
	GrandChild ob=new GrandChild();
	        ob.setName("Pratiksha");
	        ob.setAge(22);
	        ob.setAddress("Sangewadi");
	        ob.setOccupation("MSC(computer-I)");
	   System.out.println("Name="+ob.getName());
	   System.out.println("Age="+ob.getAge());
	   System.out.println("Address="+ob.getAddress());
	   System.out.println("Education="+ob.getOccupation());
	   System.out.println();
		  Child obj1=new Child();
		   obj1.setName("Prabhakar");
		   obj1.setAge(60);
		   obj1.setAddress("Sangewadi");
		   obj1.setOccupation("Lab Attendant");
		System.out.println("Information about the Child :");
	    System.out.println("Name="+obj1.getName());
		System.out.println("Age="+obj1.getAge());
		System.out.println("Address="+obj1.getAddress());
		System.out.println("Occupation="+obj1.getOccupation());
		   System.out.println();

		System.out.println("Information about the Parent :");
	      Parent ob3=new Parent();
                 ob3.setName("Sukhadev");
                 ob3.setAge(93);
                 ob3.setAddress("Sangewadi");
                 ob3.setOccupation("Farmer");
	  System.out.println("Name="+ob3.getName());
	  System.out.println("Age="+ob3.getAge());
	  System.out.println("Address="+ob3.getAddress());
	  System.out.println("Occupation="+ob3.getOccupation());
	
	   
	    
}
	
	
}
