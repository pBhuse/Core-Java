package jdbcProgram;
import java.sql.*;
public class Test {

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		
         String url="jdbc:mysql://localhost:3306/codemind?useSSL=false";
         String user="root";
         String pass="system";
         String sql="select * from student";
         Class.forName("com.mysql.cj.jdbc.Driver");  
         System.out.println("Driver register successfully.........");
         Connection con=DriverManager.getConnection(url,user,pass);
         System.out.println("Connection successful.......");
         Statement s= con.createStatement();
         ResultSet rs=s.executeQuery(sql);
           while(rs.next())
         {
	      System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
          }
         con.close();
	 }

}
