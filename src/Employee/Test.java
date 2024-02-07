package Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee obt=new Employee();
       Employee obt1=new Employee(103,"Pratiksha",30000f);

       System.out.println(obt1.empId);
       obt.display();//we access display method because :use default Access Specifier it access in same package
	  //  System.out.println(obt.eaddress);// we can't access this variable because: use the private  accessSpecifier it can't access outside class
	System.out.println("Country :"+obt.country);//We can access This variable because : It use Protected  Access-Specifier it access same package 
	}

}
