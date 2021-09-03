package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import repository.OrderListRepository;

public class OrderList implements Serializable {

	
	private static final long serialVersionUID = 1L;
	List<Order> orderList;

	public OrderList() {
		this.orderList = new ArrayList<Order>();
	}
	
	public String readAllOrders() {
		String result = "";
		for(Order o : this.orderList) {
			result = result + o + "\n";
		}
		return result;
	}
	
	public void addOrderToTheList(Order order) {
		orderList.add(order);
		OrderListRepository.saveOrderList(this);
	}
	
	public String toString() {
		return readAllOrders(); 
	}
}
