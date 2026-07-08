package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductDAO {
	
	public void addProduct(Product p) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(
				DBDetails.URL,
				DBDetails.USER,
				DBDetails.PWD
				);
		
		PreparedStatement pstmt = con.prepareStatement(DBDetails.INSERT_PRODUCT);
		
		pstmt.setInt(1, p.getId());
		pstmt.setString(2, p.getName());
		pstmt.setInt(3, p.getPrice());
		pstmt.setInt(4, p.getQuantity());
		
		int rows = pstmt.executeUpdate();
		
		System.out.println(rows + " row inserted");
		
		pstmt.close();
		con.close();
	}
	
	
	
	
	
	
	//Reading data
	
	public void getProducts() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(DBDetails.URL, DBDetails.USER, DBDetails.PWD);
		
		PreparedStatement pstmt = con.prepareStatement(DBDetails.SELECT_ALL);
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int price = rs.getInt(3);
			int quantity = rs.getInt(4);
			
			System.out.println("id: " + id + " name: " + name + " price: " +price + " quantity: "+ quantity);
			
		}
		
		
		
		pstmt.close();
		con.close();
	}
	
	
	
	
	
	//Update data
	
	public void updateProduct(int price, int id) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(DBDetails.URL, DBDetails.USER, DBDetails.PWD);
		
		PreparedStatement pstmt = con.prepareStatement(DBDetails.UPDATE_PRODUCT);
		
		pstmt.setInt(1, price);
		pstmt.setInt(2, id);
		
		int rows = pstmt.executeUpdate();

		System.out.println(rows + " row updated");
		
		
	}

}
