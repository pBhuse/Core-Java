package polymorphismOverridingAssignment;

public class Manager extends Employee
{

	void IncrementSalary()
	{
		salary=salary+10000;
		System.out.println("Manager Increment salary :"+salary);
		
	}
	public static void main(String[] args) 
	{
		   System.out.println("Q1.Implementation of method overriding :");
		Employee ob1=new Manager();
		ob1.setEmpId(102);
		ob1.setEmpName("Reshma");
		ob1.setSalary(41000);
	    System.out.println("Manager Information :");
		System.out.println("Employee Id:"+ob1.getEmpId());
		System.out.println("Employee name:"+ob1.getEmpName());
		System.out.println("Manager salary before Incrementation :"+ob1.getSalary());
        ob1.IncrementSalary();
	}
	
}
