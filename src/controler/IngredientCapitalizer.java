package controler;

public class IngredientCapitalizer {

	/*
	 * Capitalizes ingredients so that they all have same structure, making it easier to add or remove them
	 * */
	public static String capitalize(String original) {
	    if (original == null || original.length() == 0) {
	        return original;
	    }
	    return original.substring(0, 1).toUpperCase() + original.substring(1).toLowerCase();
	}
	
}
