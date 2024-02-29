package StaticKeywordImplementation;

public class StaticVariable 
{
	
public static void main(String[] args)
{
	Student ob=new Student();
	ob.srollno=101;
	ob.name="smita";
	ob.clgName="Sangola Mahavidyalay Sangola";
	// or Student.clgName="Sangola College Sangola";
	
	Student ob1=new Student();
	ob1.srollno=102;
	ob1.name="pratiksha";
	ob1.clgName="Vidnyan Mahavidyalay Sangola";
	
	System.out.println(ob.srollno);
	System.out.println(ob.name);
	System.out.println(ob.clgName);//clgName=Vidnyan Mahavidyalay Sangola  beacuse: It Always print changeable  values 
	// and  static variable only one memory  Allocate for all objects.
	
	System.out.println(ob1.srollno);
	System.out.println(ob1.name);
	System.out.println(ob1.clgName); //or System.out.println(Student.clgName);
	
	
	Student.mno="1234567896";
	System.out.println("Mobile no:"+Student.mno);
}
}
