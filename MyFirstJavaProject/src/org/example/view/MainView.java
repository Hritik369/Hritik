package org.example.view;
import org.example.model.Customer;


public class MainView {
	//Hint
		// int number=10;
		// String name="Hritik";
		//String name=new String("Hritik");
		// System.out.println(number); // output: 10;
		//System.out.println("The number is "+number); // output: The number is 10
		
		// Define a method that accepts Customer Object and returns customer Id
		
		// Define a method that accepts Product object and return product name
		
		//Define a method that accepts customer id and prints customer name inside the method definition
	// Define a method that accepts product price in the method definition, 
		// double the value of price and return the new price
	//defining method
	int getCustomerIdFromCustomer(Customer custObj){
		String  custName=custObj.getCustomerName();// Calling mathod
		int custId=custObj.getCustomerId();
		
		return custId;
	}
		
		public static void main(String[] args) {
					  Customer customer1=new Customer(12,"Hritik");
					 MainView mainviewObj=new MainView();
					 mainviewObj.getCustomerIdFromCustomer(customer1);
					 int id=customer1.getCustomerId();
					 System.out.println(12);
					 mainviewObj.getCustomerIdFromCustomer(customer1);
					 String name=customer1.getCustomerName();
					 System.out.println("Hritik");
					 
					 
	
		
		}

	
	}




