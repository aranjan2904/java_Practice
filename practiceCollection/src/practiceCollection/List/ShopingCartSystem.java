package practiceCollection.List;

import java.util.List;
import java.util.ArrayList;

public class ShopingCartSystem {
	public static void main(String[] args) {
		
		List<Product> cart = new ArrayList<>();
		
		cart.add(new Product(1, "Laptop", 50000, 1));

		cart.add(new Product(2, "Mouse", 800, 2));

		cart.add(new Product(3, "Keyboard", 1500, 1));
		
		cart.add(new Product(4, "Phone", 4000, 3));
		
		cart.add(new Product(5, "Charger", 1300, 2));
		
		double total = 0;
		double max = 0;
		Product expensiveProduct = null;
		
		for(Product p : cart) {

		    System.out.println(p.name);

		    System.out.println(p.price);

		    System.out.println(p.quantity);

		    System.out.println();
		    
		    total = total + (p.price * p.quantity);
		    
		    if(p.price > max ) {
		    	max = p.price;
		    	expensiveProduct = p;
		    }
		}
		
		System.out.println("Total Bill: " + total);
		System.out.println("Expensive Product: " + expensiveProduct.name);
	}
}
