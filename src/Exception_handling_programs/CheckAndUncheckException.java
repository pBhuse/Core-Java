package Exception_handling_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckAndUncheckException 
{

	public static void main(String[] args)
	{
		//1.unchecked Exception
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		
		//2.checked Exception
		File f=new File("E:/pratiksha resume.pdf");
		try
		{
		FileInputStream fis= new FileInputStream(f);
	}catch(FileNotFoundException fe)
		{
		System.out.println("File not found exception");
		}
	}
	
	
	
	
	
	
}
