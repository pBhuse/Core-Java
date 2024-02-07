package Employee;
import Manager.ManagerInfo;//import the ManagerInfo class  By using packageName.ClassName;
public class Employee {

	public int empId;
	String  empName;
	float salary;
	private String eaddress="Sangewadi";
	protected String country="India";
	public static void main(String[] args)
	{

		Employee ob=new Employee(101,"ABC",20000.7f);
		ob.show();
		ManagerInfo obj= new ManagerInfo();//we create the object of managerInfo class because managerInfo use public access Specifier  
	}
	public Employee()
	{
		System.out.println("This is Default Constructor");
		
	}
     public Employee (int e,String en,float m)
    {
	empId=e;
	empName=en;
	salary=m;
     }
   public void show()
   {
	System.out.println("Emp id="+empId);
	System.out.println("Emp Name="+empName);
	System.out.println("Emp ="+salary);
	
   }
   void display()//default 
   {
	   System.out.println("This is Display Method");
   }
	void addDisplay()
	{
		System.out.println("Address :"+eaddress);//we access private variable only within class
	}
   }
