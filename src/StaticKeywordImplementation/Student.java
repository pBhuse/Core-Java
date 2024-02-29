package StaticKeywordImplementation;

public class Student
{
  int srollno;
  String name;
 static String clgName;
 static String mno;
public int getSrollno() {
	return srollno;
}
public void setSrollno(int srollno) {
	this.srollno = srollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static String getClgName() {
	return clgName;
}
public static void setClgName(String clgName) {
	Student.clgName = clgName;
}

}
