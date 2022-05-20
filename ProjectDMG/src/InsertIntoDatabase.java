import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class InsertIntoDatabase
{
	public static void insert(String name , String ph_no , String Address, String budget, String Loan , String Date, String types , String l_speed , String want , String h_speed , String lisence )
	{
		try 
		{
			DAO d = new DAO();
			Connection conn = d.getConnection();
			
			String insertQuery = "insert into enquiry values(?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement ps;
			
		    ps = conn.prepareStatement(insertQuery);
			
			ps.setString(1,name);
			ps.setString(2,ph_no);
			ps.setString(3,Address);
			ps.setString(4,budget);
			ps.setString(5,Loan);
			ps.setString(6,Date);
			ps.setString(7,types);
			ps.setString(8,l_speed);
			ps.setString(9,want);
			ps.setString(10,h_speed);
			ps.setString(11,lisence);
			
			ps.executeUpdate();
			System.out.println("Data Inserted Successfully...!!");
		    JOptionPane.showMessageDialog(null,"Data  Successfully Inserted !!!");			
			
		} catch (Exception e) 
		{
			System.out.println(e);
//			 JOptionPane.showMessageDialog(null, "User Already Register with given Id","",JOptionPane.ERROR_MESSAGE);	 
			 

		}
	}

}
