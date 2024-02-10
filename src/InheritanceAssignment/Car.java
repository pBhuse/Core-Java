package InheritanceAssignment;

public class Car extends Vehicle
{
	
    int numbeOfDoors;
	void showVehicle()
	{  Vehicle vob=new Vehicle();
		 System.out.println("Information about the car :");
		     System.out.println("Vehicle model="+model);
			System.out.println("Vehicle color="+color);
			System.out.println("Vehicle speed="+speed+"km/h");
			System.out.println("Vehicle model="+fuelType);
			System.out.println("Vehicle price="+price);
			System.out.println("Number of Doors="+numbeOfDoors);
	}
	
	public void setNumbeOfDoors(int numbeOfDoors) {
		this.numbeOfDoors = numbeOfDoors;
	}	
}
