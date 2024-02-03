package NonPrimitiveArrayImplementation;

public class AnotherStudent {
	void PrintArray(Student []arr)
	{
		 System.out.println("Element Access In AnotherStudent Class:");

		for(Student i:arr)
		{
		System.out.println("RollNo:-"+i.rollNo);
		System.out.println("Name:-"+i.name);
	}
	}

}


