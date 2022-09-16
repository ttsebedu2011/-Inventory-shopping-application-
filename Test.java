/**Thando Tsebedu
 * R00221555*/

package project;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ProductDB obj = new ProductDB();
		
		Phone p1 = new Phone(obj, " iPhone8", " 5G ", 10.5 , Make.Apple, " A22 ", " 32GB");
		Phone p2 = new Phone(obj," Nokia3210", " 3G ", 100.5 , Make.Nokia , " N 66 ", " 64GB");
		Phone p3 = new Phone(obj," SamsungJ5", " 3G ", 210.5 , Make.Samsung , " S78 ", " 8GB");
		Phone p4 = new Phone(obj," iPnoneXR", " 5G ", 310.5 , Make.Apple ,  " A33 ", " 16GB");
		
		TV t1 = new TV(obj," JVC", " Flat scren", 650, " JVC45363", " 4K", Type.LCD);
		TV t2 = new TV(obj," Sony", " Curve screen", 350, " Sony89393", " 8K", Type.LED);
		TV t3 = new TV(obj," Walker", " 8inch", 1110.5, " Walker89377", " 4K", Type.LCD);
		
		OrderDetails orderDetails1 = new OrderDetails(p2, 5);
		OrderDetails orderDetails2 = new OrderDetails(t1,2);
		OrderDetails orderDetails3 = new OrderDetails(t3, 1);
		
		ArrayList<OrderDetails> orderDetailsArray = new ArrayList<OrderDetails>(); 
		orderDetailsArray.add(orderDetails1);
		orderDetailsArray.add(orderDetails2);
		orderDetailsArray.add(orderDetails3);
		
		Order order = new Order(orderDetailsArray);
		
		ArrayList <Order> orderArray = new ArrayList<Order>();
		orderArray.add(order);
		
		Customer customerOrders = new Customer("Thando", "Cork Ireland", orderArray);
		
		customerOrders.showAll();
		
		obj.displayAllProducts();

	}

}
