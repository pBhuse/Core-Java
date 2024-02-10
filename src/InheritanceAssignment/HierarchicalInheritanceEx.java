package InheritanceAssignment;

public class HierarchicalInheritanceEx 
{
public static void main(String[] args)
{
	System.out.println(" Q1.Write a simple program to implement hierarchical inheritance.");
	Motorcycle obj=new Motorcycle();
	obj.setModel("Honda");
	obj.setColor("Black");
	obj.setFuelType("Petrol");
	obj.setSpeed(250);
	obj.setPrice(55000);
	obj.showVehicle();

	Car obj1=new Car();
	obj1.setModel("Toyota");
	obj1.setColor("White");
	obj1.setFuelType("diesel");
	obj1.setSpeed(130);
	obj1.setPrice(75000);
	obj1.setNumbeOfDoors(4);
	obj1.showVehicle();
	
}
}
