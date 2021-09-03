package repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.OrderList;

public class OrderListRepository {

	/*
	 * Saving and reading order master list
	 * */
	
	public static void saveOrderList(OrderList orderList) {
		  try {	            
			  FileOutputStream f = new FileOutputStream(new File("OrderMasterList.txt"));
			  ObjectOutputStream o = new ObjectOutputStream(f);

			  // Write objects to file
			  o.writeObject(orderList);

			  o.close();
			  f.close();
		} catch (IOException e) {
            System.out.println("Error initializing stream");
        }
	}
	
	public static OrderList loadOrderList() {
		
		OrderList result = null;
		try {
			FileInputStream fi = new FileInputStream(new File("OrderMasterList.txt"));
	        ObjectInputStream oi = new ObjectInputStream(fi);
	        
	        result = (OrderList) oi.readObject();
	        
	        oi.close();
            fi.close();
            
          
		} catch (FileNotFoundException e) {
			//If file was not found, new order masterlist has to be created
            System.out.println("File not found, creating new order list");
            result = new OrderList();
        } catch (IOException e) {
        	e.printStackTrace();
           // System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
		return result;

	}
}
