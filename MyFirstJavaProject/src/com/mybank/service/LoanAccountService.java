package com.mybank.service;

public class LoanAccountService {
	private int LoanId;
	private int LoanAmount;
	private int RateofInterest;
	private int time;
	public int calculateInterest(int LoanAmount,int Rateofinterest,int time) {
		LoanAmount=LoanAmount;
		RateofInterest=Rateofinterest;
		time=time;
		int SI=(LoanAmount*RateofInterest*time)/100;
		return SI;
	}

}
