package ArrayBacicAssignment3;

public class Employee {
	

	int empId;// Variable Declaration
	String empName;
	Float Salary;
	String empDept;
	public int getEmpId()
	{
		return empId;
	}
	public void setEmpId(int empId)
	{
		if(empId>0)
		{
			this.empId = empId;

		}
		else
		{
			System.out.println("Incorrect Input");
			empId=0;
		}
		
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		this.Salary = salary;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	@Override
	public String toString() {
		return " [empId=" + empId + ", empName=" + empName + ", Salary=" + Salary + ", empDept=" + empDept
				+ "]";
	}
	
	
}
