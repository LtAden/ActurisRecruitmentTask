package controler;

import model.Order;
import model.Pizza;

public class OrderCreator {
	
	public static Order createNewOrder() {
		boolean running = true;
		String userName = null;
		Order currentOrder = null;
		
		while(running) {
			//creating order
			System.out.println("To start ordering, we will need a name to which order will be assigned. Please provide your name.");
			while(userName == null) {
				userName = ScannerControler.getInput();
			}
			
			currentOrder = new Order(userName);
			
			//loop for ordering pizzas
			while(running) {
				Pizza currentPizza = null;
				currentPizza = PizzaCreator.createPizza();
				
				//modify ingredients or accept them
				IngredientModifier.modifyPizzaIngredients(currentPizza);
				
				//When pizza is accepted, add it to current order, and print order contents
				currentOrder.addPizzaToTheOrder(currentPizza);
				System.out.println(currentOrder);
				
				//ask if want to add another pizza to order
				System.out.println("Would you like to add another pizza to your order? Type in (Another) to add more pizzas, or (Submit) to finalize your order");
				
				String addPizza ="";
				
				while(true) {
					addPizza = ScannerControler.getInput();
					if(addPizza == null) {
						System.out.println("null is not supported. Try (Another) to add more pizzas, or (Submit) to finalize your order");
					} else if (addPizza.equalsIgnoreCase("Another")) {
						break;
					} else if(addPizza.equalsIgnoreCase("Submit")) {
						running = false;
						System.out.println("Order submitted successfully. Do you want to create another (Order), or view Order (History)?");
						break;
					} else System.out.println("That doesnt seem like correct input. Try (Another) to add more pizzas, or (Submit) to finalize your order");
					
				}
				
				
				
			}
		}
		return currentOrder;
	}
}
