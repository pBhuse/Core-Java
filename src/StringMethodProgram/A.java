package StringMethodProgram;

public class A {
	public static void main(String[] args) {
		//1. Premitive data type comparison
		int a = 10;
		
		int b = 10;
		
		if(a==b) {
			System.out.println("A and B both are same");
		}else {
			System.out.println("A and B both are not same");
		}
		
		//2. Object comparison
		
		A aObj = new A();
		A bObj = new A();
		
		//2.1 Comparison operator
		
		if(aObj == bObj) {
			System.out.println("Both objects are same");
		}else {
			System.out.println("Both Objects are not same");
		}
		
		//2.2 equal method
		
		if(aObj.equals(bObj)) {
			System.out.println("Both objects are same using equal");
		}else {
			System.out.println("Both Objects are not same using equal");
		}
		
		
		//3. String Literal Comparison
		
		String s = "CodeMind";
		String s1 = "codeMind";
		
		//3.1 Comparison operator
		
		if(s == s1) {
			System.out.println("Both String literal are same");
		}else {
			System.out.println("Both String literal are not same");
		}
		
		//3.2 equal method
		if(s.equals(s1)) {
			System.out.println("Both String literal are same using equals method");
		}else {
			System.out.println("Both String literal are not same  using equals method");
		}
		
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("Both String literal are same using equals ignore");
		}else {
			System.out.println("Both String literal are not same  using equals ignore");
		}
		//4. String Object Comparison
		
		String sObj = new String("CodeMind");
		String s1Obj = new String("CodeMind");
		
		//4.1  Comparison operator
		
		if(sObj == s1Obj) {
			System.out.println("Both String Objects are same");
		}else {
			System.out.println("Both String Objects are not same");
		}
		
		//4.2 equal method
		if(sObj.equals(s1Obj)) {
			System.out.println("Both String Objects are same using equals method");
		}else {
			System.out.println("Both String Objects are not same using equals method");
		}
	}
}
