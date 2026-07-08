package debitAndCredit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnections {
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 Connection con = DriverManager.getConnection(DBDetails.URL,DBDetails.USER,DBDetails.PWD);
			 
			 System.out.println("Connection sucessfull");
			 
			 
			
			
		}
}
