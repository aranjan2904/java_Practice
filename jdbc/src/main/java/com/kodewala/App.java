package com.kodewala;

import java.sql.*;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	//this will load the sql driver
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	String url = "jdbc:mysql://localhost:3306/jdbc_demo";
    	
    	String useName = "root";
    	String password = "Shubham@2904";
    	
    	Connection con = DriverManager.getConnection(url, useName, password);
    	
    	System.out.println("Connected Successfully");
    	
    	//Reading data from database
    	Statement stmt = con.createStatement();
    	
    	ResultSet rs  = stmt.executeQuery("Select * from orders");
    	
    	while(rs.next()) {
    		
    		int id = rs.getInt(1);
    		String name = rs.getString(2);
    		int price = rs.getInt(3);
    		String status = rs.getString(4);
    		
    		System.out.println(id + " " + name + " " + price + " " + status);
    	}
    	
    	
    	//Inserting data
    	
//    	String query = "insert into orders values(?,?,?,?)";
//    	
//    	PreparedStatement ps = con.prepareStatement(query);
//    	
//    	ps.setInt(1,4);
//    	ps.setString(2, "mouse");
//    	ps.setInt(3, 1200);
//    	ps.setString(4, "Pending");
//    	
//    	int row = ps.executeUpdate();
//    	System.out.println(row + " row inserted");
//    	
    	
    	//Update data
    	String updateQuery = "Update orders set name=?, price=?, status=? where id=?";
    	
    	PreparedStatement psu = con.prepareStatement(updateQuery);
    	
    	psu.setString(1, "Charger");
    	psu.setInt(2, 1500);
    	psu.setString(3, "Delievered");
    	psu.setInt(4, 1);
    	
    	int rowu = psu.executeUpdate();
    	System.out.println(rowu + " row updated");
    	
    	//delete data
    	String queryd = "delete from orders where id=?";

    	PreparedStatement psd = con.prepareStatement(queryd);

    	psd.setInt(1, 4);

    	int rows = psd.executeUpdate();

    	System.out.println(rows + " row deleted");
    	
    	con.close();
    	
    }
}
