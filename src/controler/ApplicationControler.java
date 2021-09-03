package controler;

import model.OrderList;
import repository.OrderListRepository;

public class ApplicationControler {
	
	public static void runApplication() {
		
		OrderList orderMasterList = OrderListRepository.loadOrderList();
		String action ="";
		
		//application loop
		while(true) {
			System.out.println("Welcome to pizza ordering application. Type in commands from brackets to perform actions. Would you like to create an (Order), "
					+ " view order (History), or (End) the program??");
			while(true) { 
				action = ScannerControler.getInput();
				if(action == null) {
					System.out.println("Incorrect input. Try (Order) or (History) - without brackets");
				} else if(action.equalsIgnoreCase("End")) {
					System.exit(0);				
				} else if(action.equalsIgnoreCase("History")) {
					System.out.println(orderMasterList.readAllOrders());
					System.out.println("Would you like to (Order) now?");
				} else if (action.equalsIgnoreCase("Order")){
					orderMasterList.addOrderToTheList(OrderCreator.createNewOrder());
					action ="";
				} else {
					System.out.println("Incorrect input. Try (Order) or (History) - without brackets, or (End) to close the program");
			}
			
		}
		}
	}
}
