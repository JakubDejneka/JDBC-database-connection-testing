package test;
import java.sql.*;


public class ConnectionClass {
	

	public static void main(String[] args) throws SQLException {		
		
		
		String host = "localhost";
		String port = "3306";

		// Creating connection to DB:
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/test", "root", "");		
		
		Statement s=con.createStatement();
		
		//Executing statement:
		ResultSet rs = s.executeQuery("select * from Persons where LastName = 'doskonaly'");
		
		while(rs.next()) {
			System.out.println("MUSCOVADO! "+ rs.getString("FirstName") + " " +rs.getString("LastName")  );
			//System.out.println(rs.getString("FirstName"));
		}
		
				
	
	}

}
