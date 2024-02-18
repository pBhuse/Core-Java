package polymorphismOverridingAssignment;

public class Developer extends Employee
{
   void IncrementSalary()
   {
	   salary=salary+10000;
	   System.out.println(" Developer Increment salary :"+salary);
	   
   }
   public static void main(String[] args) 
   { 
	   System.out.println(" Q1.Implementation of method overriding :");
	   Employee ob=new Developer();
	   ob.setEmpId(101);
	   ob.setEmpName("Pratiksha");
	   ob.setSalary(40000);
	   System.out.println("Developer Information :");
	   System.out.println("Employee Id:"+ob.getEmpId());
	   System.out.println("Employee Name :"+ob.getEmpName());   
	   System.out.println("Developer salary before Incrementation :"+ob.getSalary());
	   ob.IncrementSalary();
}
}
