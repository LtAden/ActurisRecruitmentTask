package controler;

import model.Pizza;

public class PizzaCreator {

	public static Pizza createPizza() {
		Pizza result = null;
		
		while(result == null) {
			System.out.println("What pizza would you like to order? Currently we can offer you (Margherita), (Capriciosa) or (Calzone).");
			result = PizzaFactory.getPizza(ScannerControler.getInput());
		}
		
		return result;
	
	}
	

	
}
