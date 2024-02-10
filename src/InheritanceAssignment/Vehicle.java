package InheritanceAssignment;

public class Vehicle
{
   String model;
   String color;
   double speed;
   float price;
   String fuelType;
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getSpeed() {
	return speed;
}
public void setSpeed(double speed) {
	this.speed = speed;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getFuelType() {
	return fuelType;
}
public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
}

void showVehicle()
{
	System.out.println("This is vehicle class method ");
	
	
}

}
