package controler;

import model.Pizza;

public class IngredientModifier {
	
	public static Pizza modifyPizzaIngredients(Pizza p) {
		Pizza modifiedPizza = p;
		String recievedInput = "";
		System.out.println(modifiedPizza);
		boolean running = true;
		while(running) {
			System.out.println("Would you like to modify ingredients of your pizza? Use (add <ingredient>) or (remove <ingredient>) to add or remove ingredients. "
					+ "Example: add potato will add potato ingredient to your pizza.\nWhen you are satisfied with the outcome, (Accept) the pizza");
			recievedInput = ScannerControler.getInput();
			if(recievedInput == null) {
				System.out.println("null input is not really supported. Sorry");
			} else if (recievedInput.toLowerCase().startsWith("add")) {
				modifiedPizza.addIngredient(recievedInput.split(" ", 2)[1]);
			} else if(recievedInput.toLowerCase().startsWith("remove")) {
				modifiedPizza.removeIngredient(recievedInput.split(" ", 2)[1]);
			} else if(recievedInput.equalsIgnoreCase("Accept")) {
				running = false;
			} else System.out.println("Something went wrong. Are you sure you put your request in correctly? Try (add Pepperoni), (remove Pineapple) or (Accept)");
		}
		return modifiedPizza;
	}
}
