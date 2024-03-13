package Exception_handling_programs;

public class BasicException

{
public static void main(String[] args) {
		
		System.out.println("Inside Main method");
		
		try {
			
			int a = 10;
			int b = 5;
			
			
			int res = a/b;

			System.out.println(res);
			
			int[] arr = new int[1];
			
			System.out.println(arr[0]);
			
			String name = null;
			
			try {
				System.out.println(name.charAt(1));
			}catch(Exception e1) 
			{
				System.out.println("Inside catch block");
			}
//			catch(ArrayIndexOutOfBoundsException aie)
//			{
//				System.out.println("ArrayIndexOutOfBoundsException occured");
//			}  
			/* Exception is a super class it handle  all exception that's why no require 
			to write ArrayIndexOutOfBoundsException ( it handle already)
			
			
			*/
			
			
		} catch (ArithmeticException ae) 
		{
			
			System.out.println("Arithmentic Exception occured");
		} catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("ArrayIndexOutOfBoundsException occured");
		}catch (Exception e) 
		{
			System.out.println(e);
		}finally
		{
			System.out.println("Inside Finally block");
		}
		
		
		BasicException obj = new BasicException();
		obj.m1();
	}
	
	void m1()
	{
		
		System.out.println("Inside Basic-m1");
		m2();
	}
	
	void m2() {
		System.out.println("Inside Basic-m2");
	}
}
