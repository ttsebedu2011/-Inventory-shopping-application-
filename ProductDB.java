/**Thando Tsebedu
 * R00221555*/

package project;

//import java.util.ArrayList;
import java.util.HashMap;

public class ProductDB {
	
	HashMap<Integer, Product> productMap = new HashMap<Integer, Product>();
	

	public void add(Product product) {
		this.productMap.put( product.getProductID(), product);
		
	}
	
	public void remove(Product product) {
		this.productMap.remove(product.getProductID());
	}
	
	public HashMap<Integer, Product> find(int productID) {
		if(productMap.containsKey(productID)) {
			 System.out.println(productMap.get(productID).print());
			
		}else {
			System.out.println("No product ID");
			
		}
		
		return this.productMap;	
	}
	
	public void displayAllProducts() {
		productMap.forEach((a, b) -> {
			System.out.println(b.print());
	});
	}
	

}
