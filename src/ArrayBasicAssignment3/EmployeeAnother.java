package ArrayBasicAssignment3;

public class EmployeeAnother {
	//Employee obj=new Employee();
	
	void printArray(Employee[]arr)
	{
		System.out.println("......................................................................................");
		System.out.println("Employee Records In EmployeeAnother class: ");
		for (Employee emp : arr) {
			
			System.out.println(emp.toString());
		}
		
	}


}
