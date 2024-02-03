package NonPrimitiveArrayImplementation;

public class StudentArray
{
public static void main(String[] args) 
{
	//Create The Object Of Student Class
	Student obj1=new Student();
	Student obj2=new Student();
	Student obj3=new Student();
	Student obj4=new Student();
    obj1.rollNo=101;
    obj1.name="Pratiksha";
    //obj1.rollNo=102; // it access updated Values//
   // obj1.name="Reshma";
    obj2.rollNo=102;
    obj2.name="Reshma";
    obj3.rollNo=103;
    obj3.name="Smita";
    obj4.rollNo=104;
    obj4.name="Sanmesh";
   
	Student[]StudArray=new Student[4];// We create Student Type Of Array.
	StudArray[0]=obj1;
	StudArray[1]=obj2;
	StudArray[2]=obj3;
	StudArray[3]=obj4;
	StudentArray ob=new StudentArray();//create the object of StudentArray Class
	    ob.getStudent(StudArray);//invoke method of StudentArray Class
	    System.out.println(".............................................");
	AnotherStudent obj=new AnotherStudent();//create the object of AnotherStudent class
		obj.PrintArray(StudArray); //invoke the method of AnotherStudent Class.
}
  
void getStudent(Student []arr )
{ System.out.println("Element Access In StudentArray Class:");
	for(int i=0;i<arr.length;i++)
	{
		Student sobj=arr[i];
	
	System.out.println("RollNo:-"+sobj.rollNo);
	System.out.println("Name:-"+sobj.name);
}
}

}