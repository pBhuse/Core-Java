package polymorphismOverridingAssignment;

public class Employee
{
   int EmpId;
   String empName;
   float salary;
public int getEmpId() {
	return EmpId;
}
public void setEmpId(int empId) {
	EmpId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
void IncrementSalary()
{
	//System.out.println("Employee Salary:");
}
}
