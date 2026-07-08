package jdbc2;

public class App {
	public static void main(String[] args) throws Exception{
		
		ProductDAO dao = new ProductDAO();
		
		Product p = new Product(103, "Phone", 10000, 80);
		
		dao.addProduct(p);
		
		dao.getProducts();
		
		dao.updateProduct(6000, 101);
		
	}

}
