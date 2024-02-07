package Manager;
import Employee.Employee;
public class ManagerInfo extends Employee
{

	public static void main(String[] args)
	{
		Employee eob=new Employee();
		Employee eob1=new Employee(102,"xyz",15000f);
		eob1.show();//we access the show method because: use use access specifier public also we create default constructor as public
	    System.out.println("Employee Id:"+eob1.empId);//empId is public  
	//eob.display();//we can not access the display method outside the package because: It is default method
	   //System.out.println(eob.eaddress);// we can't access this variable because: use the private  accessSpecifier it can't access outside  package
    //   System.out.println("Country :"+eob.country);//we can't directly access the protected variable  to outside the class .
	
	    ManagerInfo mob=new ManagerInfo();
	    System.out.println("Country :"+mob.country); //here we access protected data member outside the package by using child class object . 
	
	}
 
}
