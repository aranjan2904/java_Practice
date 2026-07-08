package jdbc2;

public class DBDetails {
	
	public static final String URL = "jdbc:mysql://localhost:3306/invoice";
	
	public static final String USER = "root";
	
	public static final String PWD = "Shubham@2904";
	
	
	public static final String INSERT_PRODUCT = "insert into product values(?,?,?,?)";
	
	public static final String SELECT_ALL = "select * from product";
	
	public static final String UPDATE_PRODUCT = "update product set price = ? where id = ?";
	
	public static final String DELETE_PRODUCT = "delete from product where id = ?";
}
