/**Thando Tsebedu
 * R00221555*/

package project;

public class OrderDetails {
	
	private Product product;
	private int quantity;
	
	OrderDetails(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "" + product + " \nquantity = " + quantity + "\n";
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
}

