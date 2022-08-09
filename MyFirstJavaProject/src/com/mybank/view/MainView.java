package com.mybank.view;
import com.mybank.service.LoanAccountService; 
public class MainView {
   
	public static void main(String[] args) {
		LoanAccountService Interest1=new LoanAccountService();
		int Interest=Interest1.calculateInterest(60000, 2, 2);
		System.out.println("My interest is: "+ Interest);
	}
}
