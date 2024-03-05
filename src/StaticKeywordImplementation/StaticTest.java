package StaticKeywordImplementation;

public class StaticTest 
{
    static int srollno;
    static String sname;
    static void display()
    {
    	System.out.println("This is static method");
    }
    static
    {
    	System.out.println("This is Static block1");
    	
    }
    static
    {
    	System.out.println("This is Static block2");

    }
    {
    	System.out.println("This is non-Static block1");
    }
    {
    	System.out.println("This is non-Static block2");

    }
    public StaticTest()
    {
    	System.out.println("This is Default constructor");
    }
    public StaticTest(int srollno)
    {
    	this.srollno=srollno;
    	System.out.println("This is Parameterized constructor");

    	System.out.println("Roll no:"+srollno);
    }
    
    public static void main(String[] args)
    {
		System.out.println("Inside main method");
		
		StaticTest sob=new StaticTest();
		StaticTest sob1=new StaticTest(10);
	}
}
