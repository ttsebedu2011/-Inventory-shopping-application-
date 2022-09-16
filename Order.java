/**Thando Tsebedu
 * R00221555*/

package project;

import java.util.ArrayList;

public class Order{

	ArrayList<OrderDetails> orderDetails = new ArrayList<OrderDetails>();
	
	Order(ArrayList<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}	
	
	@Override
	public String toString() {
		return "" + orderDetails + "";
	}

	public void addOrderDetails(OrderDetails orderDetails) {
		this.orderDetails.add(orderDetails);
		
	}
	
	public void removeOrderDetails(OrderDetails orderDetails) {
		
		try {
			this.orderDetails.remove(orderDetails);
			System.out.println("Order details removed!!!");
		}catch(IndexOutOfBoundsException e)	{	
			System.out.println("Order details not removed");
		}
	}
	
	public ArrayList<OrderDetails> findOrderDetails(int productID) {
		try {
			System.out.println(orderDetails.get(productID).getProduct().print() + "\nQuantity " + orderDetails.get(productID).getQuantity());

		}catch(IndexOutOfBoundsException e)	{	
			System.out.println("Order details not found");
		}
		
		return orderDetails;
	}
	
}
