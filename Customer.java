/**Thando Tsebedu
 * R00221555*/

package project;

import java.util.ArrayList;

public class Customer{

	private String name;
	private String address;
	ArrayList<Order> order = new ArrayList<Order>();
	
	Customer(String name, String address, ArrayList<Order> order) {
		this.name = name;
		this.address = address;
		this.order = order;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void add(Order orders) {
		this.order.add(orders);
		
	}
	
	public void remove() {
		try {
			this.order.remove(order);
			System.out.println("Order removed!!!");
		}catch(IndexOutOfBoundsException e)	{	
			System.out.println("Order not removed");
		}
		
	}
	
	public ArrayList<Order> getOrder(int productID) {
		try {
			this.order.get(productID);
			System.out.println("Order details Found!!!");
		}catch(IndexOutOfBoundsException e)	{	
			System.out.println("Order details not found");
		}
		return this.order;
	}
	
	@Override
	public String toString() {
		return "Customer  " + this.order + "\n";
	}
	
	
	public void showAll() {
		
		System.out.println("Customer Name: " + this.getName() 
							+ "\nCustomer Address: " + this.getAddress() 
							+ "\nCustomer Order: \n"+ this.order);
		
		
	}
	
}
