package InheritanceAssignment;

public class Parent 
{
String name;
int Age;
String Occupation;
String Address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return Age;
}
public void setAge(int age) 
{
	if(age>0)
	{
	this.Age = age;
	}
	age=0;
	System.out.println("Invalid Input");
}
public String getOccupation() {
	return Occupation;
}
public void setOccupation(String occupation) {
	Occupation = occupation;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public Parent()
{

	
}

}
