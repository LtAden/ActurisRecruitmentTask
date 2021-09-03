package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable{

	private static final long serialVersionUID = 1L;
	String userName;
	List<Pizza> orderedPizzas;
	
	public Order(String name) {
		this.userName = name;
		this.orderedPizzas = new ArrayList<Pizza>();
	}
	
	public String getName() {
		return this.userName;
	}
	
	public String getOrderedPizzas() {
		String result = "";
		for(Pizza p : orderedPizzas) {
			result = result + p + "\n"; 
		}
		return result;
	}

	
	public void addPizzaToTheOrder(Pizza p) {
		orderedPizzas.add(p);
	}
	
	public String toString() {
		return "Order made by " + userName + "; Contents:\n" + getOrderedPizzas(); 
	}
	
}
