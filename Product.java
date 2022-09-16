/**Thando Tsebedu
 * R00221555*/

package project;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Product {
	
	private static AtomicInteger newProductID = new AtomicInteger(0);
	protected int productID;
	protected String name;
	protected String description;
	protected double price;
	
	Product(String name, String description, double price){
		this.name = name;
		this.description = description;
		this.price = price;
		this.productID = newProductID.incrementAndGet();
	
		
	}
	
	
	@Override
	public String toString() {
		return "\nproductID = " + productID + ", \nname = " + name + ", "
				+ "\ndescription = " + description + ", \nprice = " + price + "";
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public int getProductID() {
		return this.productID;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public abstract String print();
	
	

}
