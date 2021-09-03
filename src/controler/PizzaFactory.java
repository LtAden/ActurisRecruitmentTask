package controler;

import java.util.ArrayList;
import java.util.Arrays;

import model.Pizza;

public class PizzaFactory {
	
	
	public static Pizza getPizza(String orderedPizza) {
		if(orderedPizza == null) {
			System.out.println("Empty imput. Try again.");
			return null;
		} else if(orderedPizza.equalsIgnoreCase("Margherita")) {
			return new Pizza("Margherita", new ArrayList<String>(Arrays.asList("Dough", "Mozarella","Tomato sauce")));
		} else if(orderedPizza.equalsIgnoreCase("Capriciosa")) {
			return new Pizza("Capriciosa", new ArrayList<String>(Arrays.asList("Dough", "Mozzarella", "Baked ham", "Mushroom", "Artichoke", "Tomato")));
		} else if(orderedPizza.equalsIgnoreCase("Calzone")) {
			return new Pizza("Calzone", new ArrayList<String>(Arrays.asList("Dough", "Red onion", "Mushrooms", "Black olives", "Garlic", "Parmesan cheese", "Oregano")));
		} else {
			System.out.println("Unsupported Pizza. Try again");
			return null;
		}
			
	}			
	
}
