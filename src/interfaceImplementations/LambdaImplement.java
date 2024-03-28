package interfaceImplementations;

import java.util.Arrays;
import java.util.List;

public class LambdaImplement 
{
public static void main(String[] args)
{
	//functional interface contain single abstract method
			//lambdas can only written for functional interface
	
	LambdaExpressionsInInterface lobj=()->System.out.println("From lambda Expression");
	// lambda Expression:  ()->System.out.println("");
	//(): method , ->: indicator
	LambdaExpressionsInInterface anonymousClass=new LambdaExpressionsInInterface() {
		
		@Override
		public void hello() {
		System.out.println("From Anonymous class ");	
		}
	};
	lobj.hello();
	anonymousClass.hello();
	  
}
}
