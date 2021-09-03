package model;

import java.io.Serializable;
import java.util.List;

import controler.IngredientCapitalizer;

public class Pizza implements Serializable {

	private static final long serialVersionUID = 1L;
	String name;
	List<String> ingredients;
	
	public Pizza(String name, List<String> ingredients) {
		this.name = name;
		this.ingredients = ingredients;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getIngredients() {
		String result = "";
		for(int i = 0; i < ingredients.size(); i++ ) {
			if(i == 0) {
				result = ingredients.get(i);
			} else {
				result = result + ", " + ingredients.get(i);
			}
		}
		return result;
	}
	
	public void addIngredient(String s) {
		if(s == null) {
			System.out.println("No input");
		} else if (ingredients.contains(IngredientCapitalizer.capitalize(s))) {
			System.out.println("Ingredient already included");
		} else {
			ingredients.add(IngredientCapitalizer.capitalize(s));
			System.out.println("Ingredient " + s + " added. Current ingredients: " + this.getIngredients());
		}
	}
	
	public void removeIngredient(String s) {
		if(s == null) {
			System.out.println("No input");
		} else if (!ingredients.contains(IngredientCapitalizer.capitalize(s))) {
			System.out.println("No such ingredient in curent Pizza");
		} else {
			ingredients.remove(IngredientCapitalizer.capitalize(s));
			System.out.println("Ingredient " + s + " removed. Current ingredients: " + this.getIngredients());
		}
	}
	
	//dashes are added for readability
	public String toString() {
		return "-Pizza " + this.getName() + "; \n--Ingredients: " + this.getIngredients() + "\n";
	}
}
