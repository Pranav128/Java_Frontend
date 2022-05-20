import java.sql.Connection;
import java.sql.DriverManager;

public class DAO 
{
	 String username = "root";
	 String pass = "tiger";
	 
	 static final String DB_URL ="jdbc:mysql://localhost:3306/showroom";
      
	 public Connection getConnection()
	 {
		 Connection conn = null;
		 
		 try 
		 {
			 Class.forName("com.mysql.jdbc.Driver");
			 
			 System.out.println("Connection Successfully...!!");
			 
			 conn = DriverManager.getConnection(DB_URL,username,pass);
			 
			
		} catch (Exception e) 
		 {
			System.out.println("Unable to Connrct Database"+e);

		}
		 return conn ;
	 }
}
